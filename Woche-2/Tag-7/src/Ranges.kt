import kotlin.random.Random

fun main(){
    /*
        Ranges werden genutzt, um Bereiche von Zahlen anzugeben.
        Wir benutzen sie
            - in der Funktion .slice, um mehrere Indices auszuwählen.
            - um schnell Listen zu erstellen
            - um schnell Zufallswerte zu erstellen

        Mehr dazu in Woche 5 :)
     */


    // Eine Range erstellen mit ..-Schreibweise
    val intRange: IntRange = 2..10                  // enthält alle Zahlen von 2 bis 10
    val intListe: MutableList<Int> = (2..10).toMutableList()                // enthält alle Zahlen von 2 bis 10
    val charRange: CharRange = 'a'..'z'             // enthält alle Buchstaben von a bis z
    val doubleRange = 0.0..1.0                      // VORSICHT! unendlich viele Werte zw 0 und 1
    val intRange2: IntProgression = 1..100 step 2   // enthält alle ungeraden Zahlen von 1 bis 100
    // Progression funktioniert ähnlich wie Range

    // Eine Liste mit den Werten 1-50 erstellen:
    var zahlenListe = (1..50).toList()

    // Einen zufälligen Wert zwischen 60 und 80 generieren
    var zufallsWert: Int = (60..80).random()
    println("ZufallsZahl: $zufallsWert")

    // Bei Kommazahlen mit Random.nextDouble arbeiten
    val zufallsKommazahl : Double = Random.nextDouble(1.0, 2.0)
    println("Kommazahl: $zufallsKommazahl")

    // mehrere zufällige Werte generieren
    val points: List<Int> = listOf(
        (50..60).random(),
        (70..80).random(),
        (50..100).random(),
        (50..100).random(),
        (-30..-10).random()
    )

    points.slice(0..points.lastIndex step 2)



    var listeMitBuchstaben = ('A'..'z').toList()

    println(listeMitBuchstaben.size)

    listeMitBuchstaben.slice(0..listeMitBuchstaben.size-1 step 2)


}