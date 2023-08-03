
fun findMaximumAmountOfGold(backpackCapacity: Int, weights: IntArray): Int {
    weights.sortDescending()
    var capacityLeft = backpackCapacity
    for (w in weights) {
        if (capacityLeft >= w) {
            capacityLeft -= w
        }
    }
    return backpackCapacity - capacityLeft

}
