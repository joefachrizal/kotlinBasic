package com.latihan.kotlin

fun main() {
    arrayOne()
    arrayTwo()
}

fun arrayOne() {
    val intArray = intArrayOf(1, 3, 5, 7)
    println(intArray[2])
}

fun arrayTwo() {
    val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
    intArray[2] = 11                       // [1, 3, 11, 7]

    print(intArray[2])
}