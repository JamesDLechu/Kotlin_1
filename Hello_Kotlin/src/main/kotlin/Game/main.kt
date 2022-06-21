package Game

fun main(args: Array<String>){

    val myGame= Game()
    var myMove: String?

    while (true){
        print("Enter a direction: n/s/e/w:")
        myMove= readLine() ?: ""
        myGame.makeMove(myMove)

        if( myMove.isEmpty() ) break
    }

}
