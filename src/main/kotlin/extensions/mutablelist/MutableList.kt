package extensions.mutablelist

import base.*

inline fun <reified T : Comparable<T>> MutableList<T>.combSort(): MutableList<T> {
    return combSort(this.toTypedArray<T>()).toMutableList()
}

inline fun <reified T : Comparable<T>> MutableList<T>.insertionSort(): MutableList<T> {
    return insertionSort(this.toTypedArray<T>()).toMutableList()
}

inline fun <reified T : Comparable<T>> MutableList<T>.heapSort(): MutableList<T> {
    return heapSort(this.toTypedArray<T>()).toMutableList()
}

inline fun <reified T : Comparable<T>> MutableList<T>.mergeSort(): MutableList<T> {
    return mergeSort(this.toTypedArray<T>()).toMutableList()
}

inline fun <reified T : Comparable<T>> MutableList<T>.bubbleSort(): MutableList<T> {
    return bubbleSortOptimized(this.toTypedArray<T>()).toMutableList()
}

inline fun <reified T : Comparable<T>> MutableList<T>.quickSort(): MutableList<T> {
    return quickSort(this.toTypedArray<T>()).toMutableList()
}

inline fun <reified T : Comparable<T>> MutableList<T>.shellSort(): MutableList<T> {
    return shellSort(this.toTypedArray<T>()).toMutableList()
}
