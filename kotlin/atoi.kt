fun myAtoi(s: String): Int {
    val nums = mapOf(
        '0' to 0,
        '1' to 1,
        '2' to 2,
        '3' to 3,
        '4' to 4,
        '5' to 5,
        '6' to 6,
        '7' to 7,
        '8' to 8,
        '9' to 9
    )
    var result = 0
    var sign = 1
    var isNumber = false

    s.forEach {
        if (nums.containsKey(it)) {
            val n = nums[it]!!

            val maxVal = ((Int.MAX_VALUE - n) / 10)
            val newResult = result * 10 + n

            if(result > maxVal) {
                return when(sign) {
                    1 -> Int.MAX_VALUE
                    -1 -> Int.MIN_VALUE
                    else -> 0
                }
            }

            isNumber = true
            result = newResult

        } else if (it == '.') {
            return result * sign
        } else if (isNumber) {
            return result * sign
        } else if(it == '-') {
            sign = -1
            isNumber = true
        } else if (it == '+') {
            sign = 1
            isNumber = true
        }  else if(it !=' ' && !isNumber) {
            return 0
        }
    }

    return result * sign
}
