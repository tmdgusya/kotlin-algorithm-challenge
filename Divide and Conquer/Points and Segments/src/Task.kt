

fun countSegmentsForEach(points: IntArray, segments: Array<Pair<Int, Int>>): IntArray {
    return IntArray(points.size) { index ->
        val x = points[index]
        segments.count { x in it.first..it.second }
    }

}
