

fun main(){
    /*
        Gegeben sind 2 Liste von Kundendaten.  (die Namen wurden gelöscht :P)
        - eine Liste speichert das Alter von den Kunden
        - die zweite Liste speichert das Einkommen der Kunde

        Manche Daten sind verloren gegangen, und wurden deshalb durch null repräsentiert.
        TODO: Deine Aufgabe ist es den Durchschnitt der beiden Listen zu berechnen!
        (also das Durchschnittsalter und Durchschnittseinkommen).

        Versuche die Aufgabe ohne Schleifen zu lösen.
        Dafür kannst du geschickt mit Listenoperationen arbeiten ;)
     */

    /*  TIPPs:
        Du hast 2 Möglichkeiten mit den null-Werten umzugehen!
            a) zähle die null-Werte nicht mit                                   (easy)
            b) nutze statt null jeweils den Durchschnitt der anderen Werte      (tricky)

        Nützliche Funktionen:
        - .filterNotNull()
        - .sum() oder .average() (funktionieren nicht mit Listen in denen null-Werte stehen)
     */

    val altersListe: List<Int?> = listOf(
        20, 40, null, 25, 42,
        30, null, 35, 18, 50,
        null, 28, 45, 22, 38,
        33, null, 48, 19, 36,
        27, 44, null, 21, 39,
        32, 47, null, 24, 41
    )

    val einkommensListe: List<Double?> = listOf(
        null, 2460.40, 2999.99, null, 4141.41,
        3300.50, 2750.20, null, 3980.10, 3200.75,
        2800.60, null, 3650.30, 4100.90, null,
        2950.80, 3500.70, null, 4050.25, 2600.45,
        null, 3800.15, 3150.55, 2900.35, null,
        4350.95, 2550.15, 3700.40, null, 3450.65
    )
}