fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    var p1 = m - 1
    var p2 = nums2.size - 1

    for(i in nums1.indices.reversed()) {
        if(p1 >= 0 && p2 >= 0 && nums1[p1] > nums2[p2]) {
            nums1[i] = nums1[p1]
            p1--
        } else if(p2 >= 0) {
            nums1[i] = nums2[p2]
            p2--
        }
    }
}
