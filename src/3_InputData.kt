/*  contoh program statis dan dinamis pada kotlin
*   Mengambil Input dengan Fungsi readLine()
* */
fun main() {
    header() // memanggil fungsi header
    println("* static example")
    val name = "Joe"

    print("Hello my name is ")
    println(name)

    // menyisipkan fungsi readLine agar nama dapat diisi secara dinamis
    println("\n* dynamic example")
    print("Please Enter name : ")
    val inName = readLine()
    print("Please Enter Age : ")
    val inAge = readLine()

    print("Your name: ")
    println(inName)
    print("Your Age: ")
    println(inAge)
    footer() // memanggil fungsi footer
}

/*
*   default "fungsi header" dan "fun footer" adalah open atau public
*   memungkinkan dapat di akses darimana saja*
*
*   "fun header" sebagai header pembuka aplikasi dimulai*/
fun header() {
    println("===== Start App =====\n")
}

/*  "fun footer" sebagai header pembuka aplikasi berakhir*/
fun footer() {
    println("\n===== End App =====")
}
