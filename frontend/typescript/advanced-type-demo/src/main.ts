export type EventMap = {
  lessonStarted: { id: number };
  lessonCompleted: { id: number; score: number };
};

export type EventPayload<K extends keyof EventMap> = EventMap[K];

export function createEvent<K extends keyof EventMap>(name: K, payload: EventPayload<K>) {
  // keyof + 索引访问类型把事件名与 payload 在编译期绑定起来。
  return { name, payload };
}
