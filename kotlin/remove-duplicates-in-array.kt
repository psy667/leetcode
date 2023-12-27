fun removeDuplicates(nums: IntArray): List<Int> {
    return nums.toList().fold(mutableListOf<Int>()) { acc, cur -> if (acc.lastOrNull() != cur) acc.add(cur).let { acc } else acc }
}
