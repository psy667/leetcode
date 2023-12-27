fun countPrimes(n: Int): Int {
    if(n <= 1) return 0
    val isPrime = BooleanArray(n) { true }

    for (i in 2 .. Math.sqrt(n.toDouble()).toInt()) {
        if (!isPrime[i]) continue

        for (j in i * i until n step i) {
            isPrime[j] = false
        }
    }

    return isPrime.count { it } - 2
}
