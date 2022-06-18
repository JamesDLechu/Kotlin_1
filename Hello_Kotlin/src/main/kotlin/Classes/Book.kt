package Classes

const val maxBooksNumber: Int= 5

open class Book (val title: String, val author: String, val year: Int= 0) {

    var currentPage: Int= 0
    var actualNumberOfBooksBorrowed= 0
    var pages: Int= 0

    open fun readPage() {
        currentPage++
    }

    companion object {
        const val BASE_URL= "myUrl_"
    }

    fun getTitle_Author(): Pair<String, String> = title to author

    fun getWholeData(): Triple<String, String, Int> = Triple(title, author, year)

    fun canBorrow()= actualNumberOfBooksBorrowed < maxBooksNumber

    fun printUrl(){println("${Constants.BASE_URL}${title}.html")}
}

object Constants{
    const val BASE_URL: String= "myUrl_"
}

class eBook(val format: String= "text", title: String, author: String): Book(title, author) {

    var wordCount= 0

    override fun readPage() {
        wordCount+= 250
    }
}
