package KotlinHW

fun main() {

    println(sum(10, 5))
    println(myRepeat("Hello\n", 3))
    println(largestNum(listOf(20, 10, 52, 44, 41)))
    println(capLatter("oSLo noRwAy"))
    println(vowelsNum("Sweden"))
    println(vowelsNumTwo("SWEDEN"))
}

//ex.01
fun sum(x: Int, y: Int): Int {
    return x + y
}

//ex.02
fun myRepeat(myStr: String, myInt: Int): String {
    return myStr.repeat(myInt)
}

//ex.03
fun largestNum(myList: List<Int>): Int {
    return myList.max()
}

//ex.04
fun capLatter(userString: String): String {
    return userString
        .toLowerCase()
        .split(" ")
        .joinToString(" ") { it.capitalize() }
}

//ex.05.1
fun vowelsNum(userStr: String): Int {

    val vowels = "aeiouAEIOU"
    var count = 0

    for (char in userStr) {
        if (char in vowels) {
            count++
        }
    }
    return count
}

//ex.05.2
fun vowelsNumTwo(userStrTwo: String): Int {

    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    var count = 0

    for (char in userStrTwo.toLowerCase()) {
        if (char in vowels) {
            count++
        }
    }
    return count
}