package Buildings

fun main(args: Array<String>){
    val myBuilding= Building(Brick())
    myBuilding.build()

    isSmallBuilding(myBuilding)
}