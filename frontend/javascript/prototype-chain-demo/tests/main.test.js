import test from 'node:test';
import assert from 'node:assert/strict';
import { Lesson, hasLessonMethod } from '../src/main.js';

test('instances share prototype method', () => {
  const first = new Lesson('one');
  const second = new Lesson('two');
  assert.equal(first.describe(), 'Lesson: one');
  assert.equal(first.describe, second.describe);
  assert.equal(hasLessonMethod(first), true);
});
