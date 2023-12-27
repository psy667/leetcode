fun frequencySort(s: String): String {
    return s.split("")
        .filter(String::isNotEmpty)
        .groupBy { it }
        .values
        .groupBy { it.size }
        .entries
        .sortedByDescending { it.key }
        .map { it.value.flatten() }
        .flatten()
        .joinToString("")
}