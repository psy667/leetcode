import assert from "node:assert";
import { numDecodings } from "../decode-ways.js";

[
  ["12", 2],
  ["226", 3],
  ["06", 0],
].forEach(([input, expected]) =>
  assert.deepStrictEqual(numDecodings(input), expected),
);
