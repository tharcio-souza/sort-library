package base

import utils.swapFunction

@PublishedApi
internal fun <T : Comparable<T>> combSort(input: Array<T>): Array<T> {
    var swapped = true
    var gap = input.size

    while (gap > 1 || swapped) {
        if (gap > 1) {
            gap = (gap / 1.247330950103979).toInt()
        }
        var i = 0
        swapped = false
        while (i + gap < input.size) {

            if (input.elementAt(i) > input.elementAt(i + gap)) {
                swapFunction(input, i, i + gap)
                swapped = true
            }
            i++
        }
    }

    return input
}
