package parte2.Spices

abstract class Spice( val name: String, val spiciness: String, spiceColor: SpiceColor
) : SpiceColor by spiceColor {
    val heat: Int
        get() = when (spiciness.lowercase()) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            else -> 0
        }
    abstract fun prepareSpice()
}

interface Grinder { fun grind() }
interface SpiceColor { val color: String }
object YellowSpiceColor : SpiceColor { override val color: String = "yellow" }

class Curry( spiciness: String, spiceColor: SpiceColor = YellowSpiceColor
) : Spice( name = "Curry", spiciness = spiciness, spiceColor = spiceColor
), Grinder {
    override fun prepareSpice() { grind() }
    override fun grind() { println("Grinding the curry into powder") }
}

fun main() {
    val curry = Curry("spicy")
    println("Curry color: ${curry.color}")
    curry.prepareSpice()
}
