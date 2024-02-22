fun main() {
    // Führe einfach die printGreeting Funktion aus
    printGreeting()

    println("-----")

    // Druck das Ergebnis der printGreeting Funktion aus
    println(printGreeting())

    // Auch die Println Funktion hat kein Ergebnis
    println("-----")
    println(println("test"))
}

// Print Greeting hat kein Ergebnis, deshalb Kotlin.Unit (kann man also weglassen)
fun printGreeting() {
    println("Hallo")
}