fun dominantIndex(nums: IntArray): Int {
    var maxI = 0
    var prevMax = -Int.MIN_VALUE
    for(i in nums.indices) {
        if(nums[i] < prevMax) {
            continue
        }
        if(nums[i] > nums[maxI]) {
            prevMax = nums[maxI]
            maxI = i
        } else if(nums[i] > prevMax && i != maxI) {
            prevMax = nums[i]
        }

    }

    return if(nums[maxI] >= prevMax * 2) maxI else -1
}

fun main() {
    println(dominantIndex(intArrayOf(1,2,3,3,4,5,6,7,8,9,0,8,16,2,5,9,32,4,1,4,12)))
}


fun dominantIndex2(nums: IntArray): Int {
    var maxI = 0

    nums.forEachIndexed (fun (idx: Int, it: Int) {
        if(it > nums[maxI]) {
            maxI = idx
        }
    } )

    return if (nums.all {
            it == 0 ||
                    it == nums[maxI] ||
                    (nums[maxI] >= it * 2)
        })
        maxI
    else -1
}
