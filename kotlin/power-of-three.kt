tailrec fun isPowerOfThree(n: Double): Boolean =
    if(n > 1.0)
        isPowerOfThree(n / 3.0)
    else n == 1.0

fun isPowerOfThree(n: Int): Boolean {
    return isPowerOfThree(n.toDouble())
}
