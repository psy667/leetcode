class HouseRobber {
    private val memo = HashMap<Int, Int>()

    fun rob(nums: IntArray): Int {
        return rob(nums, nums.size - 1)
    }

    private fun rob(nums: IntArray, i: Int): Int {
        if (i < 0) return 0

        if (memo[i] != null) {
            return memo[i]!!
        }

        val res = Math.max(rob(nums, i - 1), rob(nums, i - 2) + nums[i])
        memo[i] = res
        return res
    }
}
