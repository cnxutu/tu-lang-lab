#!/usr/bin/env bash
set -u

strict=0
if [[ "${1:-}" == "--strict" ]]; then strict=1; fi

missing=()
check() {
  local label="$1" command_name="$2"; shift 2
  if ! command -v "$command_name" >/dev/null 2>&1; then
    printf '[MISSING] %s: %s\n' "$label" "$command_name"
    missing+=("$label")
    return
  fi
  printf '[OK]      %s: ' "$label"
  "$command_name" "$@" 2>&1 | head -n 1
}

printf 'K5 environment check: %s\n' "$(pwd)"
check Bash bash --version
check Git git --version
check Java java -version
check Maven mvn -version
check Python python3 --version
check Node node --version
check pnpm pnpm --version
check Go go version
check Rust rustc --version
check Cargo cargo --version
if command -v clang >/dev/null 2>&1; then
  check 'C compiler' clang --version
else
  check 'C compiler' cc --version
fi

if ((${#missing[@]} > 0)); then
  printf 'Missing: %s\n' "${missing[*]}"
  if ((strict)); then exit 1; fi
  printf 'Use --strict in CI or before a full K5 verification.\n'
fi
