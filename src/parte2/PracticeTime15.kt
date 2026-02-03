package parte2

enum class Directions2 {
    NORTH, SOUTH, EAST, WEST, START, END
}
class Game2 {
    var path = mutableListOf(Directions2.START)
    val north = { path.add(Directions2.NORTH)
        true }
    val south = { path.add(Directions2.SOUTH)
        true }
    val east = { path.add(Directions2.EAST)
        true }
    val west = { path.add(Directions2.WEST)
        true }
    val end = { path.add(Directions2.END)
        println("Game Over: $path")
        path.clear()
        false }
    fun move(where: () -> Boolean) { where.invoke() }
    fun makeMove(command: String?) {
        when (command) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end) }
    }
}
fun main() {
    val game = Game2()
    while (true) {
        print("Enter a direction: n/s/e/w: ")
        game.makeMove(readLine())
    }
}
