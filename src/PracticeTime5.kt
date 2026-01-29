
fun main(args: Array<String>) {
    for (i in 1..10) {
        val birthday = getBirthday()
        val fortune = getFortuneCookie2(birthday)
        println("Your fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getBirthday(): Int {
    print("Enter your birthday:")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie2(bday: Int): String {
    val fortunes = listOf<String>("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.", "Today is a good day for exercising restraint.", "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    return when (bday) {
        28, 31 -> "Take it easy and enjoy life!"
        in 1..7 -> "Be humble and all will turn out well."
        else -> fortunes[bday % fortunes.size]
    }
}