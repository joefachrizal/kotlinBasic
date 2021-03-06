/*
    <, >, <=, >=, ==, !=
    AND gate (&&)
    OR gate (||)
    NOT gate (!)
*/

fun main() {
    header() // memanggil fungsi header

    conjunction()
    disjunction()
    negation()
    example()

    footer() // memanggil fungsi footer
}

fun conjunction() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpenEx1 = if (now >= officeOpen && now <= officeClosed) {
        true
    } else {
        false
    }

    val isOpenEx2 = now !in officeOpen..officeClosed

    println(
        "conjunction : Office is openEx1 : $isOpenEx1 \n" +
                "conjunction : Office is openEx2 : $isOpenEx2"
    )
}

fun disjunction() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now < officeOpen || now > officeClosed

    println("Disjunction : Office is closed : $isOpen")
}

fun negation() {
    val officeOpen = 7
    val now = 10
    val isOpen = now > officeOpen

    if (!isOpen) {
        print("negation : Office is closed")
    } else {
        print("negation : Office is open")
    }
}

fun example(){
    val age = 17
    println(2>=1 && 3>=2)

    println( age>=14 && age<20)
    println( age in 14..20)

    println( age in 19..20)
}