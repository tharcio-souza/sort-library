package base

@PublishedApi
internal fun <T : Comparable<T>> mergeSort(input: Array<T>): Array<T> {

    if (input.size <= 1) {
        return input
    }

    val middle = input.size / 2
    val leftInput = input.copyOfRange(0, middle)
    val rightInput = input.copyOfRange(middle, input.size)

    return merge(mergeSort(leftInput), mergeSort(rightInput))
}


private fun <T : Comparable<T>> merge(leftInput: Array<T>, rightInput: Array<T>): Array<T> {
    val result = leftInput + rightInput

    var indexLeft = 0
    var indexRight = 0
    var resultIndex = 0

    while (indexLeft < leftInput.size && indexRight < rightInput.size) {
        if (leftInput[indexLeft] <= rightInput[indexRight]) {
            result[resultIndex] = leftInput[indexLeft]
            indexLeft++
        } else {
            result[resultIndex] = rightInput[indexRight]
            indexRight++
        }
        resultIndex++
    }
    while (indexLeft < leftInput.size) {
        result[resultIndex] = leftInput[indexLeft]
        indexLeft++
        resultIndex++
    }
    while (indexRight < rightInput.size) {
        result[resultIndex] = rightInput[indexRight]
        indexRight++
        resultIndex++
    }
    return result
}


