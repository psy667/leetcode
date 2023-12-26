import assert from "node:assert";
import { isPathCrossing } from "../path-crossing.js";

[
  ["NES", false],
  ["NESWW", true],
].forEach(([input, expected]) =>
  assert.deepStrictEqual(isPathCrossing(input), expected),
);
