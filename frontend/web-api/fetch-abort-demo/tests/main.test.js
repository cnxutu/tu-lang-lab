import test from 'node:test';
import assert from 'node:assert/strict';
import { fetchWithTimeout } from '../src/main.js';

test('aborts a slow request', async () => {
  await assert.rejects(
    fetchWithTimeout((_url, { signal }) => new Promise((resolve, reject) => {
      signal.addEventListener('abort', () => reject(new Error('aborted')));
    }), '/slow', 1),
    /aborted/
  );
});
