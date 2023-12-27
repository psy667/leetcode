fun maxSubArray(nums: IntArray): Int {
    var maxSum = nums[0]
    var curSum = nums[0]

    for (i in 1 until nums.size) {
        val it = nums[i]
        curSum += it

        if(curSum < it) {
            curSum = it
        }

        if (curSum > maxSum) {
            maxSum = curSum
        }
    }

    return maxSum
}


