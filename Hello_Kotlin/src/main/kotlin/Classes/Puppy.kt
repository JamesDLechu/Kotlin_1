package Classes

import kotlin.random.Random

class Puppy {
    fun playWithBook(myBook: Book){
        myBook.tornPages(Random.nextInt(0,  myBook.pages) + 1)
    }
}