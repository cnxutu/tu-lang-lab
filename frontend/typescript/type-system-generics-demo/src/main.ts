export type ApiResult<T> = { ok: true; data: T } | { ok: false; message: string };

export function unwrap<T>(result: ApiResult<T>): T {
  // 先缩小判别字段，再安全访问成功或失败分支。
  if (result.ok) return result.data;
  throw new Error(result.message);
}

export function first<T>(items: readonly T[]): T | undefined {
  return items[0];
}
