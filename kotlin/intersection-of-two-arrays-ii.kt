fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val nums = nums2.toMutableList()
    return nums1.filter { it ->
        val found = nums.find { n -> it == n }
        if(found != null) {
            nums.removeAt(nums.indexOf(found))
            true
        } else {
            false
        }
    }.toIntArray()
}
