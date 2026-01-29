fun main(args: Array<String>) {
    print("How are you feeling today? ")
    val mood = readLine()!!
    println(whatShouldIDoToday(mood))
}

fun whatShouldIDoToday(mood: String, weather: String = "rainy", temp: Int = 0): String {
    return when {
        twilightCore(mood, weather, temp) -> "Stay in bed"
        meltingOff(temp) -> "Go swimming"
        niceDay(mood, weather) -> "Go for a walk"
        mood == "tired" -> "Take a nap"
        mood == "excited" -> "Go party"
        else -> "Stay home and read"
    }
}

fun meltingOff(temperature: Int) = temperature > 35

fun twilightCore(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0

fun niceDay(mood: String, weather: String) =
    mood == "happy" && weather == "sunny"
