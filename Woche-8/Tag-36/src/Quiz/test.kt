package Quiz

fun main(){

    val testSpieler = Spieler("Test")


    val testFrage = Frage(
        "In Kotlin was bedeutet der Begriff 'Parameter?'",
        Kategorie.Kotlin,
        "Input für eine Funktion",
        listOf("Input für eine Funktion","Output einer Funktion", "Ergebnis einer Funktion", "Name einer Funktion")
    )

}