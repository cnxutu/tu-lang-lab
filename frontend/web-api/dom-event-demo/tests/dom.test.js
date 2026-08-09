import test from 'node:test';
import assert from 'node:assert/strict';
import { renderLesson } from '../src/dom.js';

test('renders a clickable lesson button', () => {
  const listeners = {};
  const button = {
    dataset: {},
    addEventListener(name, handler) { listeners[name] = handler; }
  };
  const document = {
    body: { append(value) { this.value = value; } },
    createElement() { return button; }
  };
  const result = renderLesson(document, { title: 'DOM' });
  assert.equal(result.textContent, 'DOM');
  listeners.click();
  assert.equal(result.dataset.clicked, 'true');
});
