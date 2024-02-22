fun main() {

//    println("Zähler: $zaehler")
    countdown()

    randomGreeting()
    randomGreeting()
    randomGreeting()

//    println("Zähler: $zaehler")
}

// Globale Variablen sind außerhalb von Funktionen
// Alle anderen Funktionen greifen drauf zu
var zaehler: Int = 5

fun countdown() {
    // Locale Variablen sind nur innerhalb der Funktion ansprechbar
    // Locale Variablen überschreiben globale Variablen
    zaehler = 3
    println(zaehler)
    Thread.sleep(100)

    zaehler--
    println(zaehler)
    Thread.sleep(100)

    zaehler--
    println(zaehler)
    Thread.sleep(100)

    println("start!")
}

fun randomGreeting() {
    var zufallsGruss = listOf("Hi", "Hallo", "Hola", "Moin", "n Guten", "Privet").random()
    println("$zufallsGruss Welt")
}

