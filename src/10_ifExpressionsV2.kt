
fun main() {
    header() // memanggil fungsi header

    print("Enter your grade: ")
    val grade = readLine()!!.toInt()

    if (grade >= 90) {
        println("A")
    }
    if (grade in 80..89) {
        println("B")
    }
    if (grade in 70..79) {
        println("C")
    }
    if (grade < 70) {
        println("Fail")
    }

    if (grade >= 90) {
        println("A")
    } else if (grade in 80..89) {
        println("B")
    } else if (grade in 70..79) {
        println("C")
    } else if (grade < 70) {
        println("Fail")
    }

    when {
        grade >= 90 -> {
            println("A")
        }
        grade in 80..89 -> {
            println("B")
        }
        grade in 70..79 -> {
            println("C")
        }
        grade < 70 -> {
            println("Fail")
        }
    }

    footer() // memanggil fungsi footer
}