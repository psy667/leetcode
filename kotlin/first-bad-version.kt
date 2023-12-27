fun firstBadVersion(n: Int, isBadVersion: (Int) -> Boolean) : Int {
    var left = 0
    var right = n

    while (right != left) {
        val idx = left + (right - left) / 2

        if(isBadVersion(idx)) {
            right = idx
        } else {
            left = idx + 1
        }
    }

    return right
}
