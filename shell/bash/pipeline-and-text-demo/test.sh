#!/usr/bin/env bash
set -Eeuo pipefail

expected=$'java=3\npython=1'
actual="$(bash "$(dirname "$0")/demo.sh")"
[[ "$actual" == "$expected" ]] || { printf 'unexpected output:\n%s\n' "$actual" >&2; exit 1; }
printf 'PASS pipeline-and-text-demo\n'
