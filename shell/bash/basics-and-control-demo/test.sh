#!/usr/bin/env bash
set -Eeuo pipefail

expected=$'project=K5\n-2=negative\n0=zero\n3=positive'
actual="$(bash "$(dirname "$0")/demo.sh")"
[[ "$actual" == "$expected" ]] || { printf 'unexpected output:\n%s\n' "$actual" >&2; exit 1; }
printf 'PASS basics-and-control-demo\n'
