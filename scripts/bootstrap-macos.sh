#!/usr/bin/env bash
set -euo pipefail

install=0
include_tomcat=0
for argument in "$@"; do
  case "$argument" in
    --install) install=1 ;;
    --include-tomcat) include_tomcat=1 ;;
    *) printf 'Unknown argument: %s\n' "$argument" >&2; exit 2 ;;
  esac
done

if ((install == 0)); then
  cat <<'PREVIEW'
Preview only. Re-run with --install to execute:
  install Homebrew if it is missing
  brew install git maven python@3.13 node go llvm pnpm
  brew install --cask temurin8 temurin17 temurin21 temurin25
  install Rust with rustup and C tools with Xcode Command Line Tools
  optionally brew install tomcat with --include-tomcat
PREVIEW
  exit 0
fi

if ! command -v brew >/dev/null 2>&1; then
  printf 'Homebrew is missing; launching the official installer.\n'
  /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
fi

brew update
brew install git maven python@3.13 node go llvm pnpm
brew install --cask temurin8 temurin17 temurin21 temurin25 ||
  printf 'Warning: one Temurin cask was unavailable; use SDKMAN or https://adoptium.net/installation/.\n' >&2

if ! xcode-select -p >/dev/null 2>&1; then
  xcode-select --install || true
fi

curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh -s -- -y
# shellcheck disable=SC1090
source "$HOME/.cargo/env"
rustup default stable
corepack enable pnpm

if ((include_tomcat == 1)); then
  brew install tomcat
  printf 'Tomcat installed through Homebrew. Run brew info tomcat for the configuration path.\n'
fi

printf '\nBootstrap complete. Open a new shell, then run:\n'
printf '  bash scripts/check-environment.sh\n'
printf '  bash scripts/set-java-home.sh 17\n'
