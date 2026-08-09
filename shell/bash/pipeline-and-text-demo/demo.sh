#!/usr/bin/env bash
set -Eeuo pipefail

records=$'java,17\njava,21\npython,3\njava,21'

# awk 负责聚合字段，sort 保证输出顺序，体现“命令各做一件事”的管道思路。
printf '%s\n' "$records" |
  awk -F',' '{count[$1]++} END {for (language in count) print language "=" count[language]}' |
  sort
