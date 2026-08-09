#!/usr/bin/env bash
set -Eeuo pipefail

expected='items=2'
actual="$(bash "$(dirname "$0")/demo.sh")"
[[ "$actual" == "$expected" ]] || { printf 'unexpected output: %s\n' "$actual" >&2; exit 1; }
printf 'PASS safe-script-demo\n'
