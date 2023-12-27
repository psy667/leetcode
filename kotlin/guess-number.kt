fun guessNumber(n: Int, guess: (Int) -> Int): Int {
    var left = 0
    var right = n

    while (left <= right) {
        val idx = left + (right - left) / 2

        when (guess(idx)) {
            0 -> return idx
            1 -> left = idx + 1
            else -> right = idx - 1
        }
    }

    return -1
}
