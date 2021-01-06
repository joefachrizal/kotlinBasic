/* contoh program operasi matematika "+, -, *, /"
*  contoh program menukar isi variable dengan dengan bantuan operasi matematika
* */
fun main() {
    header() // memanggil fungsi header

//    contoh 1
    println("Simple Calculator")
    print("Enter Number 1: ")
    val number1 = readLine()!!.toDouble()
    print("Enter Number 2: ")
    val number2 = readLine()!!.toDouble()

    val sum = number1 + number2
    println("sum: $sum")

    val sub = number1 - number2
    println("sub: $sub")

    val mul = number1 * number2
    println("mul: $mul")

    val div = number1 / number2
    println("div: $div")

//    contoh 2
    var i=5
    println(i++)
    println(i--)
    print(i)

//    contoh 3
    var vocal = 'A'

    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)

//    Kasus sepesial
//    You have two number x=10, y=20 you need to swap these two number the output x=20, y=10
    var x = 10
    var y = 20

    println("x: $x, y: $y")

    y -= x
    x += x

    println("x: $x, y: $y")

    footer() // memanggil fungsi footer
}