package extensions.mutablelist

import base.*

inline fun <reified T : Comparable<T>> MutableList<T>.combSort(): MutableList<T> {
    return CombSort().combSort(this.toTypedArray<T>()).toMutableList()
}

inline fun <reified T : Comparable<T>> MutableList<T>.heapSort(): MutableList<T> {
    return HeapSort().heapSort(this.toTypedArray<T>()).toMutableList()
}

inline fun <reified T : Comparable<T>> MutableList<T>.mergeSort(): MutableList<T> {
    return MergeSort().mergeSort(this.toTypedArray<T>()).toMutableList()
}

inline fun <reified T : Comparable<T>> MutableList<T>.bubbleSort(): MutableList<T> {
    return BubbleSort().bubbleSortOptimized(this.toTypedArray<T>()).toMutableList()
}

inline fun <reified T : Comparable<T>> MutableList<T>.quickSort(): MutableList<T> {
    return QuickSort().quickSort(this.toTypedArray<T>()).toMutableList()
}
