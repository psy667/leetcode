import kotlin.random.Random

fun IntArray.swap(i1: Int, i2: Int) {
    this[i1] = this[i2].also { this[i2] = this[i1] }
}

class Solution(var nums: IntArray) {
    fun reset(): IntArray {
        return nums
    }

    fun shuffle(): IntArray {
        val result = nums.clone()
        for (i in result.indices) {
            val randomIdx = Random.Default.nextInt(result.size)
            result.swap(i, randomIdx)
        }
        return result
    }
}
