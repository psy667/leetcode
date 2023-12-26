export const numRollsToTarget = function (n, k, target) {
  const memo = Array(n + 1)
    .fill(-1)
    .map((x) => Array(target + 1).fill(-1));

  const iter = (n, target) => {
    if (n === 0 && target === 0) {
      return 1;
    }
    if (n === 0 || target <= 0) {
      return 0;
    }

    if (n === 1) {
      if (target <= k) {
        return 1;
      }
      return 0;
    }

    if (memo[n][target] !== -1) {
      return memo[n][target];
    }

    let sum = 0;

    for (let i = 1; i <= k; i++) {
      if (target < i) break;
      sum += iter(n - 1, target - i);
    }

    memo[n][target] = sum % (1e9 + 7);

    return sum % (1e9 + 7);
  };
  return iter(n, target);
};
