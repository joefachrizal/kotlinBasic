package com.latihan.kotlin

fun main() {
    indexing()
    unicode()
    RawString()
    forloop()
}

fun indexing() {
    val textString = "kotlin"
    val text = "kotlin"
    val firstChar = text[0]

    println("First character of $text is $firstChar")
}

fun forloop() {
    val text = "kotlin"
    for (char in text) {
        print("$char ")
    }
}

fun unicode() {
    val name = "Unicode test: \u0394"
    println(name)
}

fun RawString(){
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    println(line)
}
