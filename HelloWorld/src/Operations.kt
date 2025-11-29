fun trueOrFalse(input: Boolean): Unit {
    if(input)
        println ("True")
    else
        println("False")
}

fun trueOrFalse(input: String): Unit {
    println(input)
}

fun main() {
    trueOrFalse(2<=3)
    trueOrFalse("Naveen")
}