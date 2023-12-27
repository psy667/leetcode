fun subarraySum(nums: IntArray, k: Int): Int {
    val hashMap = mutableMapOf(0 to 1)
    
    var sum = 0
    var result = 0
    
    nums.forEach {
        sum += it
        result += hashMap.getOrDefault(sum - k, 0)
        hashMap[sum] = hashMap.getOrDefault(sum, 0) + 1
    }
    
    println(hashMap)
    return result
}