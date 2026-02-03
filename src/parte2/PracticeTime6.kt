package parte2

import parte2.Spices.Grinder

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

interface SpiceColor { val color: Color }

object YellowSpiceColor : SpiceColor { override val color: Color = Color.YELLOW }

sealed class Spice2( val name: String, val spiciness: String = "mild", spiceColor: SpiceColor
) : SpiceColor by spiceColor {
    val heat: Int
        get() = when (spiciness.lowercase()) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            else -> 0
        }
    abstract fun prepareSpice()
}

class Curry( spiciness: String, spiceColor: SpiceColor = YellowSpiceColor
) : Spice2("Curry", spiciness, spiceColor), Grinder {
    override fun prepareSpice() { grind() }
    override fun grind() { println("Grinding the curry into powder") }
}
