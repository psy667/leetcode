import { numRollsToTarget } from "../number-of-dice-rolls-with-target-sum.js";
import assert from "node:assert";
[
  [[1, 6, 3], 1],
  [[2, 6, 7], 6],
  [[30, 30, 500], 222616187],
].forEach(([input, expected]) => {
  assert.deepStrictEqual(numRollsToTarget(...input), expected);
});
