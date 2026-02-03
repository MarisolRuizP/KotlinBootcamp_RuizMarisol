package parte2

open class Book( val title: String, val author: String ) {
    private var currentPage: Int = 0
    open fun readPage() {
        currentPage++
    }
}

class eBook( title: String, author: String, val format: String = "text"
) : Book(title, author) {
    private var wordCount: Int = 0
    override fun readPage() {
        wordCount += 250
    }
}

fun main() {
    val book = Book("Red Rising", "Pierce Brown")
    book.readPage()
    val ebook = eBook("Vicious", "V.E. Schwab")
    ebook.readPage()
    ebook.readPage()
}
