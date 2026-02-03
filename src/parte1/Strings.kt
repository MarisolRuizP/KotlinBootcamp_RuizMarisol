package parte1

fun main() {
    val trout = "trout"
    var haddock = "haddock"
    var snapper = "snapper"
    println("I don't like to eat $haddock nor $snapper, but i can eat $trout")
    //--------------------------
    val fishName = "mako"
    when (fishName.length) {
        0 -> println("No hay pescao")
        in 3..12 -> println("Gran pescao")
        else -> println("Decente pescao")
    }
}