class FibonacciNumber {
    private val cache = mutableMapOf(0 to 0, 1 to 1)

    fun fib(n: Int): Int =
        cache[n] ?: (fib(n - 1) + fib(n - 2))
            .also { cache[n] = it }
}
