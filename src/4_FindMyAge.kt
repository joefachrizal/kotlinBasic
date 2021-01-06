import java.util.*

fun main() {
    header() // memanggil fungsi header

    print("Enter Year of Birth: ")
    val yearOfBirth = readLine()!!.toInt()
    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR)
    val age1 = 2019 - yearOfBirth
    val age2 = yearInDevice - yearOfBirth

    println("Your are $age1 years old")
    println("Your are $age2 years old")

    footer() // memanggil fungsi footer
}