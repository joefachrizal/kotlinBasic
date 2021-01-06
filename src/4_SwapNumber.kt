/*  contoh program menukar isi variable dengan bantuan variable lain
* */
fun main() {
    header() // memanggil fungsi header

    print("Enter x: ")
    var x = readLine()?.toInt()
    print("Enter y: ")
    var y = readLine()?.toInt()

    println("before")
    println("value x = $x, value y = $y")

    val temp = x
    x = y
    y = temp

    println("after")
    println("value x = $x, value y = $y")

    footer() // memanggil fungsi footer
}