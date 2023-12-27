fun maxProfit2(prices: IntArray): Int {
    var bestProfit = 0
    var minValue = Int.MAX_VALUE

    for (it in prices) {
        if (it - minValue > bestProfit) {
            bestProfit = it - minValue
        }
        if(it < minValue) {
            minValue = it
        }
    }
    return bestProfit
}
