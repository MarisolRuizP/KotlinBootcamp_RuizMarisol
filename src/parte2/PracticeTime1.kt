package parte2

class SimpleSpice {
    val name: String = "curry"
    val spiciness: String = "mild"
    val heat: Int
        get() = 5
}

fun main() {
    val spice = SimpleSpice()
    println("Spice name: ${spice.name}")
    println("Spice heat: ${spice.heat}")
}
