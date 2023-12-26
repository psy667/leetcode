export const minOperations = function (s) {
  let o1 = 0;
  let o2 = 0;

  s.split("").forEach((it, idx) => {
    if (idx % 2 === 0) {
      if (it === "1") {
        o1++;
      } else {
        o2++;
      }
    } else {
      if (it === "0") {
        o1++;
      } else {
        o2++;
      }
    }
  });

  return Math.min(o1, o2);
};
