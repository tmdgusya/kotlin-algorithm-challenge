
fun changeMoney(money: Int): Int {
    return when (money) {
        0 -> 0
        1 -> 1
        2 -> 2
        3 -> 1
        4 -> 1
        else -> {
            minOf(
                changeMoney(money - 1),
                changeMoney(money - 3),
                changeMoney(money - 4)
            ) + 1
        }
    }

}
