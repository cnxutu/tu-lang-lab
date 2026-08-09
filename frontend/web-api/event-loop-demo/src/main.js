export function scheduleOrder(log) {
  log.push('sync');
  queueMicrotask(() => log.push('microtask'));
  setTimeout(() => log.push('timer'), 0);
  return log;
}
