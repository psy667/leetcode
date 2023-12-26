export const imageSmoother = function (img) {
  const result = new Array(img.length).fill(0).map(() => []);

  const coords = [
    [-1, -1],
    [-1, 0],
    [-1, 1],
    [0, -1],
    [0, 0],
    [0, 1],
    [1, -1],
    [1, 0],
    [1, 1],
  ];

  for (let y = 0; y < img.length; y++) {
    for (let x = 0; x < img[0].length; x++) {
      let sum = 0;
      let count = 0;

      coords.forEach(([yD, xD]) => {
        let current = img[y + yD]?.[x + xD];

        if (current !== undefined) {
          sum += current;
          count++;
        }
      });

      result[y][x] = Math.floor(sum / count);
    }
  }

  return result;
};
