package KotlinHW.nadavEx

fun String.dollar() = this.plus("$")

fun Int.dollar() = "${this}$"

//Ex.02 - Java
fun repeat(s: String, n: Int) : String {
    var output = ""
    for (i in 0 until 30)
        output += s
    return output
}

//Ex.03
fun List<Int>.maxNumOne() : Int {
    var output = Int.MIN_VALUE
    for (number in this) {
        if (number > output)
            output = number
    }
    return output
}

//Ex.03
fun maxNumTwo(list: MutableList<Int>): Int {
    var output = Int.MIN_VALUE
    for (number in list) {
        if (number > output)
            output = number
    }
    return output
}

//Ex.04
fun toLocalCamelCase(s: String) : String {
    return  s[0].uppercase() + s.slice(1 until s.length)
}

//Ex.04
fun toLocalCamelCaseSentence(s: String) : String {
    return s.split("").map { string ->
        toLocalCamelCase(string)
    }
        .reduce { prev, next ->
        "$prev $next"
    }
}

fun whenFunc(s: String) {
    val result = when (s) {
        "elephant" -> s.plus("$")
        "dino" -> s.plus("#")
        else -> s.plus("@")
    }
}

//null
val s : Int? = null

fun toNotOptional(numberList: List<Int?>): List<Int?> {
    return numberList.mapNotNull {
        it
    }
}

fun List<Int?>.unwrap() = toNotOptional(this)


//Main
fun main() {

    println(repeat("String",10))

    println(50.dollar())

    var list = mutableListOf<Int>(1, 2, 3, 4, 5)
    println(list.maxNumOne())

    println(toLocalCamelCase("hello world"))


    //null
    s?.let { string ->
        println(string.dollar())
    } ?: println("S is null")


    var listNotNull = listOf(1, 2, 5, 10, null, null, 20)

    listNotNull = toNotOptional(listNotNull)
    println(listNotNull)
}