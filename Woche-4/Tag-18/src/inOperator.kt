
/*
    NICHT ERLAUBT:
    if ("Jonny" && "Berta" in namensListe) {...}

    STATTDESSEN:
    if (("Jonny" in namensListe) && ("Berta" in namensListe)) {...}

    ODER:

    if (namensListe.containsAll(listOf("Jonny", "Berta"))) {...}
 */

val digits = mutableListOf<Int>()

fun main(){
    val anzahlZiffern = 3
    generateDigits(anzahlZiffern)

    println("Kannst du einer meiner $anzahlZiffern Zahlen erraten?")
    val guess = readln().toInt()

    if (guess in digits){
        println("Gratuliere, du hast richtig geraten!!")
    }
    else {
        println("Schade :( $guess ist nicht richtig.\nViel Glück beim nächsten mal.")
    }

    println("Das waren die 3 Ziffern: $digits")

}

/**
 *  Generiert eine zufällige Ganzzahl zw. 1-9
 */
fun generateRandomDigit(): Int{
    return (1..9).random()
}

/**
 *  Füllt die Liste [digits] mit unterschiedlichen Zahlen.
 *  Dafür ruft sich die Funktion, solange selbst auf, bis genügen Ziffern erstellt wurden.
 *
 *  @param n Gibt an, wie viele unterschiedliche Ziffern generiert werden sollen.
 */
fun generateDigits(n: Int){

    if (n > 9 || n < 1){
        throw Exception("Es kann maximal 9 Ziffern geben, und die Zahl der Ziffern muss positiv sein.")
    }

    // Generiere eine zufällige Zahl
    val zahl = generateRandomDigit()

    // Falls die Ziffer noch nicht in der Liste ist, fügen wir sie hinzu
    if (zahl !in digits)
        digits.add(zahl)

    if (digits.size < n)
        generateDigits(n)
}