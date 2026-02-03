package parte2

fun main() {
    val allBooks = setOf(
        "Red Rising",
        "Golden Son",
        "Morning Star"
    )
    val library = mapOf(
        "Pierce Brown" to allBooks
    )
    val hasGoldenSon = library.any { entry ->
        entry.value.contains("Golden Son")
    }
    println("Does the library have Golden Son? $hasGoldenSon")
    val moreBooks = mutableMapOf(
        "Vicious" to "V.E. Schwab"
    )
    val author = moreBooks.getOrPut("1984") {
        "George Orwell"
    }
    println("Author of 1984: $author")
}
