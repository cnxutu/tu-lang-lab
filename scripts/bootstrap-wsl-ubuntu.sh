#!/usr/bin/env bash
set -euo pipefail

install=0
include_tomcat=0
tomcat_version="11.0.24"
for argument in "$@"; do
  case "$argument" in
    --install) install=1 ;;
    --include-tomcat) include_tomcat=1 ;;
    --tomcat-version=*) tomcat_version="${argument#*=}" ;;
    *) printf 'Unknown argument: %s\n' "$argument" >&2; exit 2 ;;
  esac
done

if ((install == 0)); then
  cat <<'PREVIEW'
Preview only. Re-run with --install to execute:
  sudo apt-get update
  sudo apt-get install git curl unzip zip build-essential clang gdb lldb make pkg-config shellcheck
  configure the Eclipse Adoptium apt repository and install Temurin JDK 8/17/21/25
  install Python3, Go, Rustup, Node.js LTS through nvm, and pnpm through Corepack
  optionally download Apache Tomcat with --include-tomcat
PREVIEW
  exit 0
fi

sudo apt-get update
sudo apt-get install -y git curl wget unzip zip build-essential clang gdb lldb make pkg-config shellcheck \
  python3 python3-venv python3-pip golang-go apt-transport-https gnupg

# Adoptium packages keep JDK patch versions behind apt while exposing the K5 majors.
wget -qO- https://packages.adoptium.net/artifactory/api/gpg/key/public |
  gpg --dearmor | sudo tee /etc/apt/trusted.gpg.d/adoptium.gpg >/dev/null
codename="$(. /etc/os-release && printf '%s' "$VERSION_CODENAME")"
echo "deb https://packages.adoptium.net/artifactory/deb ${codename} main" |
  sudo tee /etc/apt/sources.list.d/adoptium.list >/dev/null
sudo apt-get update
for version in 8 17 21 25; do
  sudo apt-get install -y "temurin-${version}-jdk" ||
    printf 'Warning: temurin-%s-jdk is unavailable on this Ubuntu release; install it with SDKMAN later.\n' "$version" >&2
done

if [[ ! -s "$HOME/.nvm/nvm.sh" ]]; then
  curl -fsSL https://raw.githubusercontent.com/nvm-sh/nvm/v0.40.3/install.sh | bash
fi
# shellcheck disable=SC1090
source "$HOME/.nvm/nvm.sh"
nvm install --lts
nvm alias default 'lts/*'
corepack enable pnpm

curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh -s -- -y
# shellcheck disable=SC1090
source "$HOME/.cargo/env"
rustup default stable

if ((include_tomcat == 1)); then
  tomcat_home="$HOME/tools/tomcat"
  archive="$(mktemp)"
  url="https://dlcdn.apache.org/tomcat/tomcat-11/v${tomcat_version}/bin/apache-tomcat-${tomcat_version}.tar.gz"
  mkdir -p "$tomcat_home"
  curl -fL "$url" -o "$archive"
  tar -xzf "$archive" --strip-components=1 -C "$tomcat_home"
  rm -f "$archive"
  printf 'Tomcat installed at %s. Verify SHA-512 from https://tomcat.apache.org/download-11 before production use.\n' "$tomcat_home"
fi

printf '\nBootstrap complete. Open a new shell, then run:\n'
printf '  bash scripts/check-environment.sh\n'
printf '  bash scripts/set-java-home.sh 17\n'
