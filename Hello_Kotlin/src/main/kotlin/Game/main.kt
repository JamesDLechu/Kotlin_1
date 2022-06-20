package Game

fun main(args: Array<String>){

    val myGame= Game()
    val gameMap= Location()
    var myMove: String?

    while (true){
        print("Enter a direction: n/s/e/w:")
        myMove= readLine()

        myGame.makeMove(myMove)
        gameMap.updateLocation()
    }

}
