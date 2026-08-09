export function Lesson(title) {
  this.title = title;
}

Lesson.prototype.describe = function () {
  // 方法放在 prototype 上，多个实例共享函数而不是各复制一份。
  return `Lesson: ${this.title}`;
};

export function hasLessonMethod(lesson) {
  return Object.getPrototypeOf(lesson) === Lesson.prototype;
}
