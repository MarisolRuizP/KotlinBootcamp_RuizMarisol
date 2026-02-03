package parte2

class Spice( val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() = when (spiciness.lowercase()) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            else -> 0
        }
    init {
        println("Spice created: $name, spiciness: $spiciness, heat: $heat")
    }
}
fun makeSalt(): Spice {
    return Spice("salt")
}
fun main() {
    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("chili", "spicy"),
        Spice("ginger", "mild"),
        Spice("cayenne", "very spicy"),
        makeSalt()
    )
    val mildOrSpicy = spices.filter { it.heat <= 10 }

    println("\nSpices that are spicy or less:")
    mildOrSpicy.forEach {
        println("${it.name} - heat ${it.heat}")
    }
}


