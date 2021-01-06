fun main() {
    //memanggil fungsi header dan footer dari file lain
    header()

//    contoh 1
    println("joe, Welcome to kotlin")
    println("joe, Welcome to kotlin")
    println("joe, Welcome to kotlin")

//    contoh 2
    val str = "joe, Welcome to kotlin"
    println(str)
    println(str)
    println(str)

//    contoh 3
    val name = "joe"
    val age = 17
    val address = "Bogor"

    println("======== User Info ========")
    println("Name: " + name)
    println("Age: $age")
    println("Address: $address")

//    contoh 3
    var count = 1
    println("Count: $count")
    count = 10
    println("Count: $count")

//    contoh 4
    var hobby: String?
    hobby = null
    hobby = "Android Developer"
    print("Job ${hobby!!}")

    footer()
}

