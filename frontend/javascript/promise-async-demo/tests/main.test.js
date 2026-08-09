import test from 'node:test';
import assert from 'node:assert/strict';
import { loadAll } from '../src/main.js';

test('aggregates async results deterministically', async () => {
  assert.deepEqual(await loadAll([1, 2]), [
    { id: 1, title: 'lesson-1' },
    { id: 2, title: 'lesson-2' }
  ]);
});
