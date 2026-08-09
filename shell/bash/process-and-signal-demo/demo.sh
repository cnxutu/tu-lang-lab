#!/usr/bin/env bash
set -Eeuo pipefail

temp_dir="$(mktemp -d)"
cleanup() {
  rm -rf -- "$temp_dir"
}
trap cleanup EXIT INT TERM

worker() {
  local task_id="$1"
  sleep 0.02
  printf 'task-%s=done\n' "$task_id" > "$temp_dir/task-$task_id.result"
}

pids=()
for task_id in 1 2 3; do
  worker "$task_id" &
  pids+=("$!")
done

# 逐个 wait 传播后台任务失败，最后再排序收集结果，避免依赖完成先后。
for pid in "${pids[@]}"; do
  wait "$pid"
done
cat "$temp_dir"/*.result | sort
