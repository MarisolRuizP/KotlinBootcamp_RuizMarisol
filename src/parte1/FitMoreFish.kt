package parte1
fun main(args: Array<String>) {
    println(moreFishyONe(10.0, listOf(3, 3, 3)))                 // false
    println(moreFishyONe(8.0, listOf(2, 2, 2), hasDecorations = false)) // true
    println(moreFishyONe(9.0, listOf(1, 1, 3), 3))               // false
    println(moreFishyONe(10.0, listOf(), 7, true))               // true
}

fun moreFishyONe(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true
): Boolean {
    val currentSize = currentFish.sum()
    val capacity = if (hasDecorations) tankSize * 0.8 else tankSize
    return currentSize + fishSize <= capacity
}
