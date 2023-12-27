fun mostFrequentEven(nums: IntArray): Int {
    val map = HashMap<Int, Int>()

    for(it in nums) {
        if(it % 2 == 0) {
            map[it] = map.getOrDefault(it, 0) + 1
        }
    }

    var max = -1
    var res = Int.MAX_VALUE

    for((it, count) in map.entries) {
        if(count > max) {
            max = count
            res = it
        } else if(count == max  && it < res) {
            max = count
            res = it
        }
    }

    if(res == Int.MAX_VALUE) {
        res = -1
    }
    return res
}

