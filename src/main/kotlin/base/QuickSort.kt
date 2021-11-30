package base

import utils.swapFunction

@PublishedApi
internal fun <T : Comparable<T>> quickSort(input: Array<T>): Array<T> {
    recursiveQuickSort(input, 0, input.size - 1)
    return input
}

private fun <T : Comparable<T>> recursiveQuickSort(input: Array<T>, start: Int, end: Int) {

    val pivot = partitioner(input, start, end)

    if (start < pivot - 1) {
        recursiveQuickSort(input, start, pivot - 1)
    }

    if (end > pivot) {
        recursiveQuickSort(input, pivot, end)
    }
}

private fun <T : Comparable<T>> partitioner(input: Array<T>, start: Int, end: Int): Int {
    val pivot = input[start]
    var left = start
    var right = end

    while (left <= right) {

        while (input[left] < pivot){
            left++
        }
        while (input[right] > pivot) {
            right--
        }

        if(left <= right) {
            swapFunction(input, left, right)
            left++
            right--
        }
    }
    return left
}

