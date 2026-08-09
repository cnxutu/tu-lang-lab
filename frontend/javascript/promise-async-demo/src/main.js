export async function loadLesson(id) {
  // async/await 将 Promise 链写成顺序化流程，但仍然是异步调度。
  await Promise.resolve();
  return { id, title: `lesson-${id}` };
}

export async function loadAll(ids) {
  return Promise.all(ids.map(loadLesson));
}

// Windows 路径包含反斜杠，使用 argv 文件名判断可避免手写 file URL 的平台差异。
if (process.argv[1]?.replaceAll('\\', '/').endsWith('/src/main.js')) {
  console.log(await loadAll([1, 2]));
}
