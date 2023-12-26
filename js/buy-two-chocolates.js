const maxMin = (a, b) => (a > b ? [a, b] : [b, a]);

export const buyChoco = function (prices, money) {
  let twoMin = maxMin(prices[0], prices[1]);

  prices.slice(2).forEach((it) => {
    if (it < twoMin[0]) {
      twoMin = maxMin(it, twoMin[1]);
    }
  });

  const totalPrice = twoMin[0] + twoMin[1];

  if (totalPrice > money) {
    return money;
  } else {
    return money - totalPrice;
  }
};
