package base

import base.utils.swapFunction

@PublishedApi
internal fun <T : Comparable<T>> insertionSort(input: Array<T>): Array<T> {

    for (i in 1 until input.size) {
        var position = i

        while (position > 0 && input[position] < input[position - 1]) {
            swapFunction(input, position, position - 1)
            position --
        }
    }

    return input
}
