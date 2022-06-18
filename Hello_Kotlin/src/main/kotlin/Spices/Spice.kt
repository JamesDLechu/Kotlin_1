package Spices

fun main(args: Array<String>){
    val curry= Curry("mild")
    println("Color: ${curry.color}")

    val c1= SpiceContainer("curry")
    val c2= SpiceContainer("chilli")
    val c3= SpiceContainer("peppers")
    val c4= SpiceContainer("alitas")
    val c5= SpiceContainer("tabasco")
    val c6= SpiceContainer("harissa")

    println(c1)
    println(c2.label)
    println(c3.label)
    println(c4.label)
    println(c5.label)
    println(c6.label)
}

sealed class Spice (val name: String, val spiciness: String= "mild", val spiceColor: SpiceColor): SpiceColor by spiceColor{
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

    open fun prepareSpice(){}
}

interface Grinder{
    fun grind()
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}

interface SpiceColor{
    val color: Color
}

object YellowSpiceColor: SpiceColor{
    override val color= Color.YELLOW
}

class Curry(spiciness: String, spiceColor: SpiceColor= YellowSpiceColor): Spice(name= "curry", spiciness,
    spiceColor), Grinder{
    override fun prepareSpice() {
        println("Preparing...")
    }

    override fun grind() {
        println("Grinding...")
    }
}

data class SpiceContainer(val label: String): Spice(name= label, spiceColor = YellowSpiceColor){}