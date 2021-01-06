fun main() {
    header() // memanggil fungsi header

    example1()
    example2()
    example3()
    example4()

    footer() // memanggil fungsi footer
}

fun example1() {
    val openHours = 7
    val now = 20
    if (now > openHours) {
        println("office already open")
    }
}

fun example2() {
    val openHours = 7
    val now = 20
    val office: String
    if (now > openHours) {
        office = "Office already open"
    } else {
        office = "Office is closed"
    }

    println(office)
}

fun example3() {
    val openHours = 7
    val now = 20
    val office: String
    office = if (now > openHours) {
        "Office already open"
    } else {
        "Office is closed"
    }

    println(office)
}

fun example4() {
    val openHours = 7
    val now = 7
    val office: String
    office = if (now > 7) {
        "Office already open"
    } else if (now == openHours) {
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}