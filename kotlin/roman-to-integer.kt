fun romanToInt(s: String): Int {
    val map = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    var prev = 0

    s.forEach {
        val cur = map[it]
        assert(cur != null)

        result += cur!!
        if (cur > prev) {
            result-=prev*2
        }
        prev = cur
    }

    return result
}
