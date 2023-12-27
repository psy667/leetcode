class ClimbStairs {
    val map = mutableMapOf(
        0 to 0,
        1 to 1,
        2 to 2,
    )

    fun climbStairs(n: Int): Int {
        return map.getOrElse(n) {
            climbStairs(n - 1)
                .plus(climbStairs(n - 2))
                .also { map[n] = it }
        }
    }
}
