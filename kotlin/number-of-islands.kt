fun fill(grid: Array<CharArray>, x: Int, y: Int, to: Char) {
    if(
        x >= 0 &&
        x < grid.size &&
        y >= 0 &&
        y < grid[0].size &&
        grid[x][y] == '1' &&
        grid[x][y] != to
    ) {
        grid[x][y] = to
        fill(grid, x-1, y, '0')
        fill(grid, x+1, y, '0')
        fill(grid, x, y-1, '0')
        fill(grid, x, y+1, '0')
    }
}

fun numIslands(grid: Array<CharArray>): Int {
    for(x in grid.indices) {
        for (y in 0 until grid[0].size) {
            fill(grid, x, y, '2')
        }
    }

    return grid.fold(0) { acc, row -> acc + row.count { it == '2' } }
}
