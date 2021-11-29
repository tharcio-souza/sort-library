package base

import utils.swapFunction

class QuickSort {

    fun <T : Comparable<T>> quickSort(input: Array<T>) : Array<T> {
        realQuickSort(input, 0, input.size - 1)
        return input
    }

    private fun <T : Comparable<T>> realQuickSort(input: Array<T>, start: Int, end: Int) {

        val pivot = partitioner(input, start, end)
        if(start < pivot - 1) {
            realQuickSort(input, start, pivot - 1)
        }

        if (start > pivot) {
            realQuickSort(input, start, pivot + 1)
        }
    }

     private fun <T : Comparable<T>> partitioner(input: Array<T>, start: Int, pivot: Int): Int {

        var bigger = start

        for (i in start until pivot) {

            if (input[i] < input[pivot]) {
                swapFunction(input, i, bigger)
                bigger++
            }
        }

        swapFunction(input, bigger, pivot)

        return bigger
    }

}