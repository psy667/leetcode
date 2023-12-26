export const isPathCrossing = function (path) {
  const visited = new Set();
  let x = 0;
  let y = 0;
  visited.add("0:0");

  for (let i = 0; i < path.length; i++) {
    const it = path.at(i);

    switch (it) {
      case "N":
        y--;
        break;
      case "S":
        y++;
        break;
      case "W":
        x--;
        break;
      case "E":
        x++;
        break;
    }
    const key = x + ":" + y;

    if (visited.has(key)) {
      return true;
    } else {
      visited.add(key);
    }
  }

  return false;
};
