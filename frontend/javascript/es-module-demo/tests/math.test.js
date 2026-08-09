import test from 'node:test';
import assert from 'node:assert/strict';
import sum, { add } from '../src/math.js';

test('supports named and default exports', () => {
  assert.equal(add(1, 2), 3);
  assert.equal(sum([1, 2, 3]), 6);
});
