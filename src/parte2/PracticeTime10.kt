package parte2

import kotlin.random.Random

class Book4(
    val title: String,
    val author: String,
    var pages: Int
)
fun Book4.weight(): Double {
    return pages * 1.5
}
fun Book4.tornPages(torn: Int) {
    pages = (pages - torn).coerceAtLeast(0)
}
class Puppy {
    fun playWithBook(book: Book4) {
        val torn = Random.nextInt(1, 10)
        book.tornPages(torn)
        println("Puppy tore $torn pages. Pages left: ${book.pages}")
    }
}
fun main() {
    val book = Book4(
        title = "Idek",
        author = "By Me",
        pages = 10
    )
    val puppy = Puppy()
    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("Current book weight: ${book.weight()} grams")
    }
    println("The book has no pages left:(")
}