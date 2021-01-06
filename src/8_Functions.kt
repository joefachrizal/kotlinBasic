fun main() {
    header() // memanggil fungsi header

    val user = setUser("Joe", 19)
    println(user)

    printUser("Joe")

    footer() // memanggil fungsi footer
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}