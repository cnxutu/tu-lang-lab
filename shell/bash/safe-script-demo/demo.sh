#!/usr/bin/env bash
set -Eeuo pipefail

temp_dir="$(mktemp -d)"

cleanup() {
  # EXIT/中断都会触发清理，避免临时文件污染工作目录。
  rm -rf -- "$temp_dir"
}
trap cleanup EXIT INT TERM

input_file="$temp_dir/input.txt"
printf 'language= bash\nstatus= ready\n' > "$input_file"

# 用数组保存行，避免依赖不安全的字符串拆分。
mapfile -t lines < "$input_file"
printf 'items=%d\n' "${#lines[@]}"
