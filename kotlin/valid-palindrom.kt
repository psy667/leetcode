//fun isPalindrome(s: String): Boolean {
//    return s.lowercase()
//        .filter(Char::isLetterOrDigit)
//        .run { this == this.reversed() }
//}

fun isPalindrome(s: String): Boolean {
    var left = 0
    var right = s.length - 1
    val str = s.lowercase()

    while (left < right) {
        if (!str[left].isLetterOrDigit()) {
            left++
            continue
        }

        if(!str[right].isLetterOrDigit()) {
            right--
            continue
        }

        if(str[left] == str[right]) {
            left++
            right--
        } else {
            return false
        }
    }
    return true
}