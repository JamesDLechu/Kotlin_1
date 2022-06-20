package Game

class Game {
    var path= mutableListOf<Directions>(Directions.START)

    var north= {direction: Directions -> path.add(direction)}
    var south= {direction: Directions -> path.add(direction)}
    var east= {direction: Directions -> path.add(direction)}
    var west= {direction: Directions -> path.add(direction)}
    var end= {direction: Directions ->
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
