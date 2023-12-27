fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()

    nums.forEachIndexed { idx, it ->
        map[it] = idx
    }

    nums.forEachIndexed { idx, it ->
        if (map[target - it] != null && map[target - it] != idx) {
            return intArrayOf(idx, map[target - it] as Int)
        }
    }

    return intArrayOf(-1, -1)
}
