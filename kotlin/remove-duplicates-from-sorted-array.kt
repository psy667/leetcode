fun removeDuplicatesFromSorted(nums: IntArray): Int {
    var slow = 0

    for (fast in 1 until nums.size) {
        if (nums[fast] > nums[slow]) {
            slow++
            nums[slow] = nums[fast]
        }
    }

    return slow + 1
}
