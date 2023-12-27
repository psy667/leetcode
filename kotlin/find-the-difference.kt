fun findTheDifference(s: String, t: String): Char {
    val listS = s.split("").filter { it.isNotEmpty() }.toMutableList()
    val listT = t.split("").filter { it.isNotEmpty() }.toMutableList()

    listS.forEach {
        listT.remove(it)
    }

    return listT.joinToString().first()
}
