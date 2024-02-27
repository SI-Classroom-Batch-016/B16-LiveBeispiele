var isRaining: Boolean = getRandomBoolean()
var isSunny: Boolean = getRandomBoolean()

fun main() {

    if (isRainbow()) {
        println("🌈")
    }


    println("Geben sie ihr Email ein:")
    val email = readln()



    val accountListe: MutableList<String> = mutableListOf()

    if (accountListe.contains(email)){
//    if (email in accountListe){
        println("Diese Email ist bereits registriert")

    } else if ('@' in email && email.length > 5 ) {
    // else if (email.contains("@")) {
        println("$email ist gültig")
    } else {
        println("Ungültige Email...")
    }

}

/**
 *
 */
fun weekdayAsString(weekday: Int): String {

    var weekdayAsString: String = when (weekday) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "not real day"
    }

    return weekdayAsString
}

fun isRainbow(): Boolean {
    if (isRaining) {
        if (isSunny) {
            return true
        }
    }

    return false
}