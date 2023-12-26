import assert from "node:assert";
import { fnName } from "../file-name.js";

[[,], [,], [,]].forEach(([input, expected]) =>
  assert.deepStrictEqual(fnName(input), expected),
);
