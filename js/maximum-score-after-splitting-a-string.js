export const maxScore = function (s) {
  const zerosFromLeft = s
    .split("")
    .reduce(
      (acc, cur) =>
        cur === "0" ? [...acc, acc.at(-1) + 1] : [...acc, acc.at(-1)],
      [0],
    )
    .slice(1);

  const onesFromRight = s
    .split("")
    .reduceRight(
      (acc, cur) =>
        cur === "1" ? [...acc, acc.at(-1) + 1] : [...acc, acc.at(-1)],
      [0],
    )
    .slice(1)
    .reverse();

  if (s.length === 2) {
    return zerosFromLeft[0] + onesFromRight[1];
  }

  const zip = zerosFromLeft.map((it, idx) => it + onesFromRight[idx]);

  return zip.slice(1, -1).reduce((acc, cur) => Math.max(acc, cur));
};
