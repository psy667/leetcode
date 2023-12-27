fun moveZeroes(input: IntArray): IntArray {
    var shift = 0
    var i = 0

    while(i < input.size + shift) {
        if(i >= input.size) {
            input[i - shift] = 0
        } else {
            input[i - shift] = input[i]

            if (input[i] == 0) {
                shift++
            }
        }
        i++
    }
    return input
}
