package parte2

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}
class Game {
    var path = mutableListOf(Directions.START)
    val north = {
        path.add(Directions.NORTH)
        true
    }
    val south = {
        path.add(Directions.SOUTH)
        true
    }
    val east = {
        path.add(Directions.EAST)
        true
    }
    val west = {
        path.add(Directions.WEST)
        true
    }
    val end = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }
}
fun main() {
    val game = Game()
    println(game.path)
    game.north()
    game.south()
    game.east()
    game.west()
    game.end()
    println(game.path)
}
