package base.utils

 internal fun <T> swapFunction(input: Array<T>, firstIndex: Int, lastIndex: Int) {
    input[firstIndex] = input[lastIndex].also { input[lastIndex] = input[firstIndex] }
}
