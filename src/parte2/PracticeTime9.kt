package parte2

const val MAX_BORROWED_BOOKS = 5

class Book3( val title: String, val author: String, val year: Int) {
    fun canBorrow(currentlyBorrowed: Int): Boolean {
        return currentlyBorrowed < MAX_BORROWED_BOOKS
    }
    fun printUrl() {
        println(BASE_URL + title + ".html")
    }
    companion object {
        const val BASE_URL = "https://library.locura.com/"
    }
}

fun main() {
    val book = Book3("1984", "George Orwell", 1949)
    println("Can borrow more books? ${book.canBorrow(3)}")
    book.printUrl()
}
