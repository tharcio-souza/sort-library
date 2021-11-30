package extensions.list

import base.*

inline fun <reified T : Comparable<T>> List<T>.combSort(): List<T> {
    return combSort(this.toTypedArray<T>()).toList()
}

inline fun <reified T : Comparable<T>> List<T>.insertionSort(): List<T> {
    return insertionSort(this.toTypedArray<T>()).toList()
}

inline fun <reified T : Comparable<T>> List<T>.heapSort(): List<T> {
    return heapSort(this.toTypedArray<T>()).toList()
}

inline fun <reified T : Comparable<T>> List<T>.mergeSort(): List<T> {
    return mergeSort(this.toTypedArray<T>()).toList()
}

inline fun <reified T : Comparable<T>> List<T>.bubbleSort(): List<T> {
    return bubbleSortOptimized(this.toTypedArray<T>()).toList()
}

inline fun <reified T : Comparable<T>> List<T>.quickSort(): List<T> {
    return quickSort(this.toTypedArray<T>()).toList()
}
