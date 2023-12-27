fun singleNumber(nums: IntArray): Int {
    return nums.fold(0) { acc, it -> acc xor it }
}
