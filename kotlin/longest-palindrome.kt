fun longestPalindrome(s: String): Int {
    val map = HashMap<Char, Int>()

    s.forEach {
        map[it] = map.getOrDefault(it, 0) + 1
    }

    return map.values.fold(0) { acc, it ->
        if(it % 2 == 1 && acc % 2 != 1) {
            acc + it
        } else {
            acc + (it / 2) * 2
        }
    }
}
