/**
 *
 *  Diese Datei beschreibt einige Beispiele,
 *  wie man Kommentare zur Dokumentierung in Kotlin schreiben kann
 *
 *  Die [main]-Funktion ist hier ein Beispiel für die Verwendung der Funktion [zufallsZahl].
 *  Im Beispiel wird eine zufällige Zahl im Bereich von 1 bis 100 ausgedruckt.
 *
 *  Für mehr infos: Siehe die [Dokumentation](https://kotlinlang.org/docs/kotlin-doc.html)
 *
 *  @author Gordon Lucas
 *  @author Syntax Institut
 *  @version 1.0
 *
 */
fun main() {
    val zufallszahl = zufallsZahl(1, 100)
    println("Die zufällige Zahl ist: $zufallszahl")
}

/**
 * Generiert eine zufällige ganze Zahl innerhalb des angegebenen Bereichs.
 *
 * @param min Die untere Grenze des Bereichs (Standardmäßig 0).
 * @param max Die obere Grenze des Bereichs (Standardmäßig 10).
 * @return Eine zufällige ganze Zahl im angegebenen Bereich.
 */
fun zufallsZahl(min: Int = 0, max: Int = 10): Int{
    return (min..max).random()
}

/**
 * Generiert eine zufällige ganze Zahl zwischen 0 und 100.
 *
 * @return Eine zufällige ganze Zahl zw. 0 und 100.
 */
fun zufallsZahl(): Int{
    return (0..100).random()
}