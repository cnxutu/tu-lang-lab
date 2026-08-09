import test from 'node:test';
import assert from 'node:assert/strict';
import { createCounter, lesson } from '../src/main.js';

test('closure keeps independent state', () => {
  const counter = createCounter(3);
  assert.equal(counter(), 4);
  assert.equal(counter(), 5);
});

test('method uses its receiver', () => assert.equal(lesson.describe(), 'closure'));
