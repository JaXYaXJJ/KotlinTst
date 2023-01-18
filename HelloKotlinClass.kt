fun main(args: Array<String>) {
    val isUnit = println("This is an expression")
    println(isUnit)

    val x = myFunc("Iain")
    println(x)
}

fun myFunc(name: String?): String? {
    println("Hi there! $name")
    return name
}