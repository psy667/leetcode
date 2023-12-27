fun containsDuplicate(nums: IntArray): Boolean {
    val numsSet = mutableSetOf<Int>()

    return null != nums.find {
        if (numsSet.contains(it)) {
            true
        } else {
            numsSet.add(it)
            false
        }
    }
}
