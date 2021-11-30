package extensions.array

import base.*

inline fun <reified T : Comparable<T>> Array<T>.combSort(): Array<T> {
    return combSort(this)
}

inline fun <reified T : Comparable<T>> Array<T>.insertionSort(): Array<T> {
    return insertionSort(this)
}

inline fun <reified T : Comparable<T>> Array<T>.heapSort(): Array<T> {
    return heapSort(this)
}

inline fun <reified T : Comparable<T>> Array<T>.mergeSort(): Array<T> {
    return mergeSort(this)
}

inline fun <reified T : Comparable<T>> Array<T>.bubbleSort(): Array<T> {
    return bubbleSortOptimized(this)
}

inline fun <reified T : Comparable<T>> Array<T>.quickSort(): Array<T> {
    return quickSort(this)
}


