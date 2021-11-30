package base

import utils.swapFunction

@PublishedApi
internal fun <T : Comparable<T>> bubbleSortOptimized(input: Array<T>): Array<T> {
    var changed: Boolean
    var lastIndex = input.size - 2
    do {
        changed = false
        for (i in 0..lastIndex) {
            if (input.elementAt(i) > input.elementAt(i + 1)) {
                swapFunction(input, i, i + 1)
                changed = true
            }
        }
        lastIndex--
    } while (changed)

    return input
}
