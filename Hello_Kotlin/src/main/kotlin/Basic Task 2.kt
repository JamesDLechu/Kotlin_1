fun main(args: Array<String>) {
    print("What's your mood today? ")
    val actualMood= readLine() ?: "happy"

    println(whatSouldIDoToday(mood= actualMood, "rainy",36))
}

fun whatSouldIDoToday(mood: String, weather: String= "Sunny", temperature: Int= 24) : String {
    return when{
        isGoodTimeForAWalk(mood, weather) -> "go for a walk"
        isTimeToStayInBed(mood, weather, temperature) -> "stay in bed"
        isTimeToGoSwimming(temperature) -> "go swimming"
        isTimeToDringSomeWater(mood, weather, temperature) -> "Go drink some water"
        else -> "Stay home and read"
    }
}

fun isGoodTimeForAWalk(mood: String, weather: String) = mood == "happy" && weather == "Sunny"

fun isTimeToStayInBed(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0

fun isTimeToGoSwimming(temperature: Int) = temperature > 35

fun isTimeToDringSomeWater(mood: String, weather: String, temperature: Int) = mood == "thirsty" && weather == "Sunny" && temperature > 23

