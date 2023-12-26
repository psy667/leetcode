import { minOperations } from "../minimum-changes-to-make-alternating-binary-string.js";
import assert from "node:assert";

[
  ["0100", 1],
  ["10", 0],
  ["1111", 2],
].forEach(([input, expected]) => {
  assert.deepStrictEqual(minOperations(input), expected);
});
