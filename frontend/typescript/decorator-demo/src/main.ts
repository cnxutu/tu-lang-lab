export function measured<This, Args extends unknown[], Return>(
  method: (this: This, ...args: Args) => Return,
  _context: ClassMethodDecoratorContext<This, (this: This, ...args: Args) => Return>
) {
  return function (this: This, ...args: Args): Return {
    // 装饰器包装横切行为，同时保留原方法的 this、参数和返回类型。
    return method.call(this, ...args);
  };
}

export class LessonService {
  @measured
  title(id: number): string { return `lesson-${id}`; }
}
