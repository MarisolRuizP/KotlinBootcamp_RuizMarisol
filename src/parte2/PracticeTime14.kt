package parte2

fun List<Int>.divisibleBy(operation: (Int) -> Int): List<Int> {
    return this.filter { operation(it) == 0 }
}
fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val result = numbers.divisibleBy {
        it.rem(3)
    }
    println(result)
}
