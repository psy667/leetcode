export const numDecodings = function (s) {
  const r = new Array(s.length + 1).fill(0);
  r[s.length] = 1;

  for (let i = s.length - 1; i >= 0; i--) {
    if (s[i] == 0) continue;
    r[i] = r[i + 1];
    if (s[i] + s[i + 1] <= 26) {
      r[i] += r[i + 2];
    }
  }

  return r[0];
};
