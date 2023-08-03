
fun <T : Comparable<T>> getMedian(first: List<T>, second: List<T>): T {
    assert(first.size == second.size)
    return (first.asSequence() + second.asSequence())
            .sorted()
            .drop(first.size - 1)
            .first()

}
