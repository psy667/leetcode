import assert from "node:assert";
import { minCost } from "../minimum-time-to-make-rope-colorful.js";

[
  [["abaac", [1, 2, 3, 4, 5]], 3],
  [["abc", [1, 2, 3]], 0],
  [["aabaa", [1, 2, 3, 4, 1]], 2],
  [["bbbaaa", [4, 9, 3, 8, 8, 9]], 23],
  [["aaaaaaaaaaaaaa", [1, 3, 6, 5, 4, 5, 4, 4, 2, 8, 3, 10, 6, 6]], 57],
].forEach(([input, expected], idx, arr) =>
  assert.deepStrictEqual(
    minCost(...input),
    expected,
    `Test ${idx}/${arr.length}: ${JSON.stringify(input)}`,
  ),
);
