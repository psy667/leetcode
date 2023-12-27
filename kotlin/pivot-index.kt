fun pivotIndex(nums: IntArray): Int {
    val sum = nums.sum()
    var curSum = 0

    for (i in nums.indices) {
        val it = nums[i]
        if (curSum == sum - it - curSum) {
           return i
        }
        curSum += it
    }
    return -1
}
