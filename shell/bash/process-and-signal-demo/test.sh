#!/usr/bin/env bash
set -Eeuo pipefail

expected=$'task-1=done\ntask-2=done\ntask-3=done'
actual="$(bash "$(dirname "$0")/demo.sh")"
[[ "$actual" == "$expected" ]] || { printf 'unexpected output:\n%s\n' "$actual" >&2; exit 1; }
printf 'PASS process-and-signal-demo\n'
