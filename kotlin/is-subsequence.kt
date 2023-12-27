fun isSubsequence(s: String, t: String): Boolean {
    var subseq = 0

    for(i in t.indices) {
        if(t[i] == s[subseq]) {
            subseq++
        }
    }

    return s.length == subseq
}
