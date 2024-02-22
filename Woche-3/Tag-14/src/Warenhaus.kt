/**
 * Diese Datei dient dazu, verschiedene Funktionalitäten und Verwendungen von Dokumentationskommentaren
 *  in Kotlin anhand von Beispielen zu demonstrieren.
 *
 * Hier sind Funktionen, die in dieser Datei demonstriert werden:
 *
 *  - [main]
 *  - [test]
 *  - [warenkorb]
 *  - [produktSortiment]
 *  - [warenkorbLeeren]
 *  - [preisAbfrage]
 *  - [gesamtPreisBerechnen]
 */
fun main() {

    // Die Produkte um ein Produkt erweitern
    produktSortiment["Maoam Kaugummi"] = Pair(1.5, zufallsZahl(1, 5))


    // Fügt ein Zufallsprodukt zum Warenkorb hinzu
    val zufallsProduct: String = produktSortiment.keys.random()
    warenkorb.add(zufallsProduct)

    // Was kostet das Produkt?
    println("Das zufällige Produkt ist: $zufallsProduct und kostet ${preisAbfrage(zufallsProduct)}")
//    preisAbfrage("Maoam Kaugummi")
//    preisAbfrage("Maoam Ballaballa")    // Exception


    // Fügt noch 3 Produkte hinzu
    warenkorb.add(produktSortiment.keys.random())
    warenkorb.add(produktSortiment.keys.random())
    warenkorb.add(produktSortiment.keys.random())

    // TODO: Den Gesamtpreis des Warenkorbs berechnen
    val gesamtPreis = gesamtPreisBerechnen(warenkorb)

    println("Der Warenkorb:")
    println("   $warenkorb")
    println("Gesamtpreis %.2f €".format(gesamtPreis))


    // TODO: Den Warenkorb wieder leeren
    warenkorbLeeren()

}

/**
 *   Eine MutableListe, in der die aktuellen Produkte des Käufers aufgelistet werden.
 */
val warenkorb = mutableListOf<String>()

/**
 * Eine Map, die Produkte des Stores und ihre Preise und Anzahl speichert.
 *
 * Diese Map enthält verschiedene Produkte als Schlüssel und deren
 * zugehörige Preise und Anzahl als Wertpaare.
 *
 * @see Pair
 *
 * Beispiel für einen Eintrag:
 * "Barilla Tomatensauce" -> Pair(Preis: 1.99, Anzahl: 3)
 *
 *
 */
val produktSortiment: MutableMap<String, Pair<Double, Int>> = mutableMapOf(
    "Nudeln, 500g" to Pair(1.29, zufallsZahl()),
    "Reis, 1kg" to Pair(1.79, zufallsZahl()),
    "Milch, 1L" to Pair(0.89, zufallsZahl()),
    "Eier, 10 Stück" to Pair(1.99, zufallsZahl()),
    "Butter, 250g" to Pair(1.79, zufallsZahl()),
    "Käse, 200g" to Pair(2.49, zufallsZahl()),
    "Joghurt, 500g" to Pair(0.99, zufallsZahl()),
    "Brötchen, 6 Stück" to Pair(1.49, zufallsZahl()),
    "Brot, 500g" to Pair(2.29, zufallsZahl()),
    "Gemüsebrühe, 200g" to Pair(0.79, zufallsZahl()),
    // ... Platz für mehr Produkte
    "Schokolade, 100g" to Pair(1.19, zufallsZahl())
)


/**
 * Leert den Warenkorb.
 *
 * Diese Funktion löscht alle Produkte aus dem Warenkorb, indem sie die
 * [MutableList.clear]-Methode auf dem Warenkorb aufruft. Nachdem die Funktion ausgeführt wurde,
 * ist der Warenkorb leer und enthält keine Produkte mehr.
 *
 */
fun warenkorbLeeren() {
    warenkorb.clear()
}

/**
 * Gibt den Preis für ein bestimmtes Produkt zurück.
 *
 * Diese Funktion ruft den Preis für das angegebene Produkt ab. Falls das Produkt
 * nicht in der Liste vorhanden ist, wird eine IllegalArgumentException ausgelöst,
 * um anzuzeigen, dass das Produkt ungültig ist.
 *
 * @param product Der Name des abzufragenden Produkts.
 * @return Den Preis des Produkts.
 * @throws IllegalArgumentException Wenn das angegebene Produkt nicht existiert.
 */
fun preisAbfrage(product: String): Double {
    return produktSortiment[product]?.first ?: throw IllegalArgumentException("Ungültiges Produkt")
}


/**
 * Berechnet den Gesamtpreis aller Produkte im Warenkorb.
 *
 * Diese Funktion ermittelt den Gesamtpreis aller Produkte, die sich im Warenkorb
 * befinden. Hierbei wird die Funktion [preisAbfrage] verwendet, um die Preise der
 * einzelnen Produkte abzurufen. Falls ein Produkt im Warenkorb nicht existiert,
 * wird eine IllegalArgumentException ausgelöst.
 *
 * @param warenkorb Eine Liste von Produktbezeichnungen im Warenkorb.
 * @return Den Gesamtpreis aller Produkte im Warenkorb.
 * @throws IllegalArgumentException Wenn eines der Produkte im Warenkorb nicht existiert.
 * @see preisAbfrage
 */
fun gesamtPreisBerechnen(warenkorb: List<String>): Double {
    return warenkorb.sumOf { preisAbfrage(it) }
}