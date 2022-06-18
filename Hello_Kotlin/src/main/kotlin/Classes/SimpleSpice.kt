package Classes

class SimpleSpice (val name: String, val spiciness: String= "mild") {
    val heat: Int
        get() = when(spiciness){
            "mild" -> 5
            else -> 0
        }
}

class Spice (val name: String, val spiciness: String= "mild") {
    val heat: Int
        get() = when(spiciness){
            "spicy" -> 3
            "mild" -> 2
            "not spicy" -> 1
            else -> 0
        }

    init {
        println("name: $name , spiciness: $spiciness , heat: $heat")
    }
}

fun makeSalt() = Spice(name = "salt")

