package parte2

data class SpiceContainer(val spice: Spice) {
    val label: String
        get() = spice.name
}

fun main() {
    val spice = Spice("spicy")
    val mildSpice = Spice("mild")
    val containers = listOf(
        SpiceContainer(spice),
        SpiceContainer(mildSpice)
    )
    containers.forEach {
        println(it.label)
    }
}
