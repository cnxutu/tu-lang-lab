export interface Lesson { id: number; title: string; summary?: string }

export type LessonPatch = Partial<Pick<Lesson, 'title' | 'summary'>>;

export function updateLesson(lesson: Lesson, patch: LessonPatch): Lesson {
  // Partial + Pick 只开放可编辑字段，避免更新只读标识。
  return { ...lesson, ...patch };
}
