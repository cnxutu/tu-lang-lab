export const add = (left, right) => left + right;

export default function sum(values) {
  // 默认导出适合表达模块的主能力，命名导出便于复用细粒度函数。
  return values.reduce(add, 0);
}
