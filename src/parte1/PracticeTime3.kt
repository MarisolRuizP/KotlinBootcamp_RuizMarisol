package parte1

import java.util.Calendar

fun main(args: Array<String>) {
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")
    val dia = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when (dia) {
        1 -> "sunday"
        2 -> "monday"
        3 -> "tuesday"
        4 -> "wednesday"
        5 -> "thursday"
        6 -> "friday"
        7 -> "saturday"
        else -> "No days lol"
    })
}