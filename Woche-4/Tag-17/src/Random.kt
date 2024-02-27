import kotlin.random.Random

fun getRandomBoolean(): Boolean{
    return listOf(true, false).random()
}

fun getRandomAge(): Int {
    return (1..42).random()
}

fun getRandomHeight(): Double {
    return Random(42).nextDouble(1.50, 1.95)
}


fun getRandomTemperature(): Int{
    return (-5..30).random()
}


