export function renderLesson(document, lesson) {
  const button = document.createElement('button');
  button.textContent = lesson.title;
  button.addEventListener('click', () => {
    // 事件监听器把用户动作转换成状态更新，页面无需轮询。
    button.dataset.clicked = 'true';
  });
  document.body.append(button);
  return button;
}
