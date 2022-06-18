package Classes

fun main(args: Array<String>) {
    /*
    val mySpices= listOf(Spice(name= "chilli"), Spice(name= "curry", spiciness = "spicy"), Spice(name= "peppers", spiciness = "spicy"), Spice(name= "alitas"),
        Spice(name= "tabasco", spiciness = "not spicy"), Spice(name= "harissa", spiciness = "spicy"), Spice(name= "ice-cream", spiciness = "not spicy"))

    println("Lista filtrada: ${mySpices.filter { it.heat == 3 || it.heat == 1 }.toList()}")
    */

    /*
    val myBook= eBook(title = "White Fang", author = "Edgar Allan Poe")
    println("${myBook.title} - ${myBook.author}")
    */
    val myBook= Book(title = "The Bible", author = "God", year = 1754)
    println("Here is your book ${myBook.getTitle_Author().first} written by ${myBook.getTitle_Author().second} in ${myBook.getWholeData().third}}")
    myBook.pages= 200
    myBook.printUrl()

    val myPuppy= Puppy()

    while(myBook.pages > 0){
        myPuppy.playWithBook(myBook)
        println("Numero de paginas= ${myBook.pages}")
    }

    val allBooks= listOf<String>("The Comedy of Errors", "Titus Andronicus", "The Rape of Lucrece", "King John", "Romeo and Juliet", "The Tragedy of Julius Caesar", "As You Like It", "The Tempest")
    val library: Map<String, List<String>> = mapOf("Shakespeare" to allBooks)
    println(library.any { it.value.contains("Tempest") })

    val moreBooks: MutableMap<String, String> = mutableMapOf("The Bible" to "God")

    println(moreBooks.getOrPut("White Fang", { "Someone famous" }))
    println(moreBooks)
}

fun Book.bookWeight()= pages * 1.5

fun Book.tornPages(numberOfPageToTorn: Int){if(numberOfPageToTorn <=  pages && pages > 0) pages-= numberOfPageToTorn else pages= 0}