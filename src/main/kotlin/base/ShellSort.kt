package base

@PublishedApi
internal fun <T : Comparable<T>> shellSort(input: Array<T>): Array<T> {
    val gaps = listOf(701, 301, 132, 57, 23, 10, 4, 1) // Ciura's gap sequence

    for (gap in gaps) {

        for (i in gap until input.size) {
            val temp = input[i]
            var j = i

            while (j >= gap && input[j - gap] > temp) {
                input[j] = input[j - gap]
                j -= gap
            }
            input[j] = temp
        }
    }

    return input
}