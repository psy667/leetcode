export const minCost = (colors, neededTime) => {
  let totalTime = 0;
  let cursor = 0;

  for (let i = 1; i < colors.length; i++) {
    if (colors[i] === colors[cursor]) {
      if (neededTime[i] < neededTime[cursor]) {
        totalTime += neededTime[i];
        continue;
      }
      totalTime += neededTime[cursor];
    }
    cursor = i;
  }

  return totalTime;
};
