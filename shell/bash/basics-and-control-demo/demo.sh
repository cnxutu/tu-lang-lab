#!/usr/bin/env bash
set -Eeuo pipefail

readonly PROJECT_NAME="K5"
numbers=(-2 0 3)

classify_number() {
  local number="$1"
  if ((number < 0)); then
    printf 'negative\n'
  elif ((number == 0)); then
    printf 'zero\n'
  else
    printf 'positive\n'
  fi
}

# 数组、函数和算术条件组合在一起，体现 Bash 的命令编排能力。
printf 'project=%s\n' "$PROJECT_NAME"
for number in "${numbers[@]}"; do
  printf '%s=%s\n' "$number" "$(classify_number "$number")"
done
