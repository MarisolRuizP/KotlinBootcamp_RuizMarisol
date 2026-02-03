package parte2

class Book2( val title: String, val author: String, val year: Int ) {
    fun titleAuthor(): Pair<String, String> {
        return Pair(title, author)
    }
    fun titleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main() {
    val book = Book2( title = "Truly Devious", author = "Maureen Johnson", year = 2018)
    val (title, author) = book.titleAuthor()
    val (t, a, y) = book.titleAuthorYear()
    println("Here is your book $t written by $a in $y.")
}

