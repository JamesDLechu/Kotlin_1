fun main(args: Array<String>){

    var myFortune: String
    while(true){
        myFortune= getFortuneCookie(getBirthday())

        println("Your fortune is: ${myFortune}")
        if(myFortune.contains("Take it")) break
    }

    /*
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
     */
}

fun getFortuneCookie(birthDay: Int): String {
    val fortunes= listOf("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")

    return when(birthDay){
        in 1..7 -> fortunes[2]
        28 or 30 -> fortunes[3]
        else -> fortunes[birthDay % fortunes.size]
    }
}

fun getBirthday() : Int{
    print("Enter your birthday: ")

    return readLine()?.toIntOrNull() ?: 1
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int= 2, hasDecorations: Boolean = true) : Boolean {
    var sum= fishSize

    for(fish in currentFish)
        sum+= fish

    return if(hasDecorations) (sum < (tankSize*0.8)) else (sum < tankSize)
}

fun gamePlay(diceRoll: Int){
    println(diceRoll)
}