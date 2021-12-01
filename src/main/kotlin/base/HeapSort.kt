package base

import base.utils.swapFunction

@PublishedApi
internal fun <T : Comparable<T>> heapSort(input: Array<T>): Array<T> {
    makeHeap(input)
    var lastIndex = input.size - 1
    while (lastIndex > 0) {
        swapFunction(input, 0, lastIndex)
        siftHeap(input, 0, lastIndex - 1)
        lastIndex--
    }

    return input
}

private fun <T : Comparable<T>> makeHeap(input: Array<T>) {
    var firstIndex: Int = (input.size - 2) / 2
    while (firstIndex >= 0) {
        siftHeap(input, firstIndex, input.size - 1)
        firstIndex--
    }
}

private fun <T : Comparable<T>> siftHeap(input: Array<T>, firstIndex: Int, lastIndex: Int) {
    var rootKnot = firstIndex
    while (rootKnot * 2 + 1 <= lastIndex) {

        var childKnot = rootKnot * 2 + 1

        if (childKnot + 1 <= lastIndex && input[childKnot] < input[childKnot + 1]) {
            childKnot++
        }

        if (input[rootKnot] < input[childKnot]) {
            swapFunction(input, rootKnot, childKnot)
            rootKnot = childKnot
        } else {
            return
        }
    }
}
