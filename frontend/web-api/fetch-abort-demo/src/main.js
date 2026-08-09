export async function fetchWithTimeout(fetchImpl, url, milliseconds) {
  const controller = new AbortController();
  const timer = setTimeout(() => controller.abort(), milliseconds);
  try {
    return await fetchImpl(url, { signal: controller.signal });
  } finally {
    // 无论成功还是失败都清理定时器，避免资源泄漏。
    clearTimeout(timer);
  }
}
