export function createCounter(start = 0) {
  let value = start;
  // 闭包保留私有状态，外部只能通过返回的函数修改它。
  return () => ++value;
}

export const lesson = {
  title: 'closure',
  describe() { return this.title; }
};
