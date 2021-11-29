package test

import extensions.mutablelist.*
import kotlin.random.Random

fun main() {
    val allowedChars = ('A'..'Z') + ('0'..'9')

    fun getRandomString(length: Int): String = (1..length).map { allowedChars.random() }.joinToString("")

    fun getRandomChar(): Char = allowedChars.random()

    fun getRandomInt(): Int = Random.nextInt(-100, 100)

    fun getRandomDouble(): Double = Random.nextDouble(-100.0, 100.0)

    fun getRandomFloat(): Float = Random.nextFloat()

    fun getRandomLong(): Long = Random.nextLong()

    var testCollection = (1..10).map { getRandomChar()  }.toMutableList()

    println("Ori: $testCollection")
    println("Ord: ${testCollection.combSort()}")
    println("Ord: ${testCollection.heapSort()}")
    println("Ord: ${testCollection.mergeSort()}")
    println("Ord: ${testCollection.bubbleSort()}")
    println("Ord: ${testCollection.quickSort()}")




}