fun strStr(haystack: String, needle: String): Int {
    loop@ for(i in 0..haystack.length - needle.length) {
        var t = i

        for(char in needle) {
            if(haystack[t] == char) {
                t++
            } else {
                continue@loop
            }
        }
        return i
    }

    return -1
}
