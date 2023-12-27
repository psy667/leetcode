fun isCharDuplicated(chars: CharArray): Boolean {
    val charSet = mutableSetOf<Char>()

    return null != chars.find {
        return@find if(it == '.') {
            false
        } else if (charSet.contains(it)) {
            true
        } else {
            charSet.add(it)
            false
        }
    }
}


fun isValidSudoku(board: Array<CharArray>): Boolean {
    for(i in 0 until 9) {
        val arr1 = mutableListOf<Char>()
        val arr2 = mutableListOf<Char>()
        val arr3 = mutableListOf<Char>()

        for (j in 0 until 9) {
            arr1.add(board[j][i])
            arr2.add(board[i][j])
            val offsetI = (i % 3 * 3)
            val offsetJ = (i / 3 * 3)

            arr3.add(board[offsetI + j / 3][offsetJ + j % 3])
        }

        if (
            isCharDuplicated(arr1.toCharArray())
            || isCharDuplicated(arr2.toCharArray())
            || isCharDuplicated(arr3.toCharArray())
        ) {

            return false
        }
    }

    return true
}

