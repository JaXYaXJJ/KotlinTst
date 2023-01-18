package KotlinTst

fun main() {
    println(shouldChangeWater("Sunday"))
}

fun shouldChangeWater
            (day: String,
             temperature: Int = 22,
             dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}