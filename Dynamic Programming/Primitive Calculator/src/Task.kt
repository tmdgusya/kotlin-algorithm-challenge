fun findMinimumOperations(n: Int): List<Int> {
    var i = n
    val answer = mutableListOf<Int>()
    while (i > 1) {
        answer.add(i)
        i = when {
          i % 3 == 0 -> i / 3
          i % 2 == 0 -> i / 2
          else -> i - 1
        }
    }
    answer.add(1)
    answer.reverse()
    return answer
}
