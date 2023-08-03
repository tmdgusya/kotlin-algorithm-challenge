

fun findMinimumChange(v: IntArray): Long {
    return v.sumOf { it.toLong() } + 1
}