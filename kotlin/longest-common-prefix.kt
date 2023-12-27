fun String.intersect(str: String): String {
    var result = str
    while(!this.startsWith(result)) {
        result = result.dropLast(1)
    }
    return result
}

fun longestCommonPrefix(strs: Array<String>): String {
    return strs.fold(strs[0]) { acc, cur -> acc.intersect(cur)}
}
