class FindAnagrams {
    fun Char.idx(): Int {
        return this.toInt() - 'a'.toInt()
    }

    fun findAnagrams(s: String, p: String): List<Int> {
        if (s.isEmpty() || p.isEmpty() || s.length < p.length) {
            return listOf()
        }

        val map = Array(26){0}
        val initMap = Array(26){0}

        for (ch in p) {
            initMap[ch.idx()]++
        }


        var start = 0
        var end = p.length
        val result = mutableListOf<Int>()

        for(i in p.indices) {
            map[s[i].idx()]++
        }

        if(initMap.contentEquals(map)) {
            result.add(start)
        }

        while (end < s.length) {
            map[s[end].idx()]++
            map[s[start].idx()]--

            start++
            end++

            if(initMap.contentEquals(map)) {
                result.add(start)
            }

        }

        return result
    }
}
