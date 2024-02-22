package bonus
/*
    In dem vorgegebenen Code sind bereits folgende Dinge implementiert:

    Händler-Map (haendler):
    Es gibt eine vordefinierte Map namens haendler, die verschiedene Tränke und ihre Preise enthält.

    Inventar-Map (inventar):
    Es gibt eine leere, veränderbare Map namens inventar, die dazu dienen soll, den Bestand der gekauften Tränke zu verwalten.

    Gold (gold):
    Es gibt eine Variable gold, die den verfügbaren Goldbetrag des Spielers repräsentiert und mit einem Startwert von 50.0 initialisiert ist.

    TODO:
     deine Aufgabe ist es jetzt einige Funktionen zu implementieren, diese sind bereits erstellt.
     Teil der Aufgabe ist es (noch) nicht eine Main-Funktion zu schreiben (das kommt nächste Woche).

    TIP:
        Schreibe dir selbst eine Main-Funktion in der du die Funktionen nach belieben austesten kannst.
 */

val haendler: Map<String, Double> = mapOf(
    "Elixier der Weisheit" to 3.00,
    "Trank der Stärke" to 2.50,
    "Unsichtbarkeitsserum" to 4.00
)

val inventar: MutableMap<String, Int> = mutableMapOf(
)

var gold: Double = 50.0


//TODO: Die Funktion trankKaufen() soll einem Spieler ermöglichen, einen Trank vom Händler zu kaufen.
//      Sie sollte den Nutzer nach dem gewünschten Trank fragen, den Bestand überprüfen,
//      den Kauf abwickeln (Inventar aktualisieren und Gold abziehen) und entsprechende Meldungen ausgeben.
fun trankKaufen() {

}


//TODO: Die Funktion trankTrinken(trank: String) soll einen Trank aus dem Inventar trinken.
//      Sie soll prüfen und ausgeben, ob der Trank vorhanden ist.
//      Dann sollte sie den Trank konsumieren, also das Inventar aktualisieren und entsprechende Meldungen ausgeben.
fun trankTrinken(trank: String) {

}

//TODO: Die Funktion trankVerkaufen(trank: String) soll einen Trank an den Händler verkaufen.
//      Sie sollte das Inventar überprüfe und den Verkauf abwickeln (Inventar aktualisieren und Gold erhöhen)
//      und entsprechende Meldungen ausgeben.
fun trankVerkaufen(trank: String) {

}