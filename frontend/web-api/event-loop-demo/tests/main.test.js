import test from 'node:test';
import assert from 'node:assert/strict';
import { scheduleOrder } from '../src/main.js';

test('microtask runs before timer', async () => {
  const log = scheduleOrder([]);
  await new Promise(resolve => setTimeout(resolve, 5));
  assert.deepEqual(log, ['sync', 'microtask', 'timer']);
});
