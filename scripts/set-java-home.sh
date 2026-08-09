#!/usr/bin/env bash
set -eu

version="${1:?Usage: ./set-java-home.sh 8|17|21|25}"
if command -v /usr/libexec/java_home >/dev/null 2>&1; then
  export JAVA_HOME="$(/usr/libexec/java_home -v "$version")"
else
  candidate="$(find /usr/lib/jvm "$HOME/.sdkman/candidates/java" -maxdepth 1 -type d -iname "*${version}*" 2>/dev/null | sort | head -n 1 || true)"
  if [[ -z "$candidate" ]]; then
    printf 'JDK %s not found. Install it with SDKMAN or your OS package manager.\n' "$version" >&2
    exit 1
  fi
  export JAVA_HOME="$candidate"
fi
export PATH="$JAVA_HOME/bin:$PATH"
printf 'JAVA_HOME=%s\n' "$JAVA_HOME"
java -version
