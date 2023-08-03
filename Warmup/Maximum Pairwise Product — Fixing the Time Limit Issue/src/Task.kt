fun maximumPairwiseProduct(a: IntArray): Long {
    val len = a.size
    var res = Long.MIN_VALUE
    for (i in 0 until len) {
        for (j in i + 1 until len) {
            res = kotlin.math.max(res, a[i].toLong() * a[j])
        }
    }
    return res

}
