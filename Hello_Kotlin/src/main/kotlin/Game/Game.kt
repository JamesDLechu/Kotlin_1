package Game

class Game {
    var path= mutableListOf<Directions>(Directions.START)
    val myLocation= Location()

    var north= {direction: Directions -> if(myLocation.updateLocation(direction)) path.add(direction) else showErrorMessage() }
    var south= {direction: Directions -> if(myLocation.updateLocation(direction)) path.add(direction) else showErrorMessage() }
    var east= {direction: Directions -> if(myLocation.updateLocation(direction)) path.add(direction) else showErrorMessage() }
    var west= {direction: Directions -> if(myLocation.updateLocation(direction)) path.add(direction) else showErrorMessage() }
    var end= {direction: Directions ->
            myLocation.updateLocation(direction)
            path.add(direction)
            println("Game Over: ${path}")
            path.clear()
            false
        }

    fun move(where: () -> Unit){
        where()
    }

    fun makeMove(direction: String?) {
        when(direction){
            "n" -> move{ north( Directions.NORTH ) }
            "s" -> move { south( Directions.SOUTH ) }
            "e" -> move { east( Directions.EAST ) }
            "w" -> move { west( Directions.WEST ) }
            else -> move { end( Directions.END ) }
        }
    }
}

fun showErrorMessage(){
    println("Oops, out of the map, try another direction!")
}