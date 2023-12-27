fun fill(image: Array<IntArray>, x: Int, y: Int, from: Int, to: Int) {
    if(
        x >= 0 &&
        x < image.size &&
        y >= 0 &&
        y < image[0].size &&
        image[x][y] == from &&
        image[x][y] != to
    ) {
        image[x][y] = to
        fill(image, x-1, y, from, to)
        fill(image, x+1, y, from, to)
        fill(image, x, y-1, from, to)
        fill(image, x, y+1, from, to)
    }
}

fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
    fill(image, sr, sc, image[sr][sc], color)
    return image
}
