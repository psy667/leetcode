fun runningSum(nums: IntArray): IntArray {
    val arr = Array(nums.size) { 0 }
    var sum = 0

    for((idx, it) in nums.withIndex()) {
        sum += it
        arr[idx] = sum
    }
    return arr.toIntArray()
}
