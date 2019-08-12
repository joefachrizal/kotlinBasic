package com.latihan.kotlin

fun main(){
    println("hello Kotlin!")
    name()
}

fun name(){
    val name = "Alfian"

    print("Hello my name is ")
    println(name)
    print(
        if (true)
            "Always true"
        else
            "Always false"
    )
}