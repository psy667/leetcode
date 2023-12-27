fun plusOne(digits: IntArray): IntArray {
    tailrec fun iter(arr: MutableList<Int>, offset: Int): IntArray {
        if (arr[arr.lastIndex - offset] == 9) {
            arr[arr.lastIndex - offset] = 0

            if(arr.lastIndex == offset) {
                arr.add(0, 1)
                return arr.toIntArray()
            }

            return iter(arr, offset + 1)
        } else {
            arr[arr.lastIndex - offset] += 1
            return arr.toIntArray()
        }
    }

    return iter(digits.toMutableList(), 0)
}
