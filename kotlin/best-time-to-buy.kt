fun maxProfit(prices: IntArray): Int {
    var result = 0
    var buy = prices.first()
    var sell = prices.first()

    for(i in 1 until prices.size) {
        val cur = prices[i]
        val prev = prices[i - 1]

        if (cur > prev) {
            sell = cur
        } else {
            result += sell - buy
            sell = cur
            buy = cur
        }
    }
    result += sell - buy

    return result
}
