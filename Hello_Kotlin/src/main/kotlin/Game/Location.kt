package Game

class Location (val width: Int = 4, val height: Int = 4){

    val map= Array(width) { arrayOfNulls<String>( height ) }
    var actualLocation: MutableMap<String,Int> = mutableMapOf("first" to 0, "second" to 0)

    init {
        map[0][0]= "Here is where you start your journey!"
        map[0][1]= "You're in 0,1"
        map[0][2]= "You're in 0,2"
        map[0][3]= "You're in 0,3"
        map[1][0]= "You're in 1,0"
        map[1][1]= "You're in 1,1"
        map[1][2]= "You're in 1,2"
        map[1][3]= "You're in 1,3"
        map[2][0]= "You're in 2,0"
        map[2][1]= "You're in 2,1"
        map[2][2]= "You're in 2,2"
        map[2][3]= "You're in 2,3"
        map[3][0]= "You're in 3,0"
        map[3][1]= "You're in 3,1"
        map[3][2]= "You're in 3,2"
        map[3][3]= "Congrat's! You made it out :D"

        println(map[0][0])
    }

    fun updateLocation(direction: Directions) : Boolean {
        when( direction ) {
            Directions.NORTH -> {
                if((actualLocation["first"] ?: 0) - 1 < 0) return false

                actualLocation["first"]= (actualLocation["first"]?.minus(1)) ?: 0
                println(map[actualLocation["first"] ?: 0][actualLocation["second"] ?: 0])
            }
            Directions.SOUTH -> {
                if((actualLocation["first"] ?: 0) + 1 > 3) return false

                    actualLocation["first"]= (actualLocation["first"]?.plus(1)) ?: 0
                println(map[actualLocation["first"] ?: 0][actualLocation["second"] ?: 0])
            }
            Directions.EAST -> {
                if((actualLocation["second"] ?: 0) + 1 > 3) return false

                    actualLocation["second"]= (actualLocation["second"]?.plus(1)) ?: 0
                println(map[actualLocation["first"] ?: 0][actualLocation["second"] ?: 0])
            }
            Directions.WEST -> {
                if((actualLocation["second"] ?: 0) - 1 < 0) return false

                    actualLocation["first"]= (actualLocation["first"]?.minus(1)) ?: 0
                println(map[actualLocation["first"] ?: 0][actualLocation["second"] ?: 0])
            }
            else -> {
                println(map[actualLocation["first"] ?: 0][actualLocation["second"] ?: 0])
            }
        }

        return true
    }
}