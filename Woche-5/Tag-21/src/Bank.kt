//Globale Variable kann in allen Funktionen verwendet werden.
//Konten sind als Map gespeichert (K: Name des Konto(inhabers), V: Geldbetrag auf dem Konto)
var bank: MutableMap<String, Double> = mutableMapOf(
    "Gordon" to 50.0,
    "Minh" to 500.0,
    "Maria F." to -123.45,
    "Maria S." to 123.53,
    "Bassam" to 150.51,
    "Luc" to 200.2,
    "Eduard" to 255.12,
    "Anna" to 300.78,
    "Cüneyt" to 350.0,
    "Nico" to 400.0,
    "Laurenz" to 450.99
)

fun main() {
/*

    //Hier soll die Programmsteuerung getestet werden.
    //d.H hier sollen nur Funktionen aufgerufen werden.
    println(bank)
    println(kontoStand("Gordon"))
    println(kontoStand(readln()))
    println(kontoStand("xyz"))
    kontoHinzufuegen("test", 10.0)
    kontoLoeschen("test")
    kontoLoeschen("Nico")
    kontoLoeschen("Nico")
    println(bank)
    geldAbheben("Gordon", 1000.0)
    println(bank)
    geldEinzahlen("Laurenz", 100.0)
    println(kontoStand("Laurenz"))
    geldUeberweisen("Laurenz", "Gordon", 120.0)
    println(bank)

    //Hier sollten Warnungen ausgeben werden
    kontoHinzufuegen("Laurenz", 10.0)
    kontoLoeschen("test2")

*/


    login()

}

/*  TODO:
     Schreibe ein Funktion, die den Betrag eines Kontos zurückgibt.
     Nutze einen Parameter Konto:String um der Funktion zu sagen,
     welches Konto zurückgegeben werden soll.

     Gibt es das Konto in unserer Bank nicht, soll eine Warnung ausgedruckt werden!

     Bei dieser Methode ist ein Rückgabewert erwünscht, der Betrag kann aber auch direkt auf der Konsole ausgeben werden.
*/
fun kontoStand(konto: String): Double? {
    if (konto in bank) { // auch möglich:  bank.keys.contains(konto) oder bank.containsKey(konto)
        return bank[konto]
    } else {
        // Entweder:
        println("Das Konto '$konto' existiert nicht")
        return null  // oder -1.0, ...

        // Oder:
        throw Exception("Das Konto '$konto' existiert nicht")
    }
}

/*
TODO:
 Schreibe eine Funktion, die neue Konten zur Bank hinzufügen soll.
 Als Parameter wählen sie einen Namen:String und einen Geldbetrag:Double
*/
fun kontoHinzufuegen(konto: String, betrag: Double = 0.0) {
    if (konto in bank.keys) { // bank.contains(konto), bank.keys.contains(konto), bank.containsKey(konto)
        //Konto existiert bereits
        println("Ein Konto unter dem Namen '$konto' existiert bereits! ")
        println("Es wurde kein neues Konto erstellt")
    } else {
        //konto existiert noch nicht
        bank[konto] = betrag
        println("Das Konto für '$konto' wurde erfolgreich erstellt")
    }
}

/*
TODO:
 Schreibe eine Funktion, die bestehende Konten entfernt.
 Nutzt als Parameter den Namen:String. Dieses konto soll aus der Map entfernt werden.
 Gibt es das Konto in der Bank nicht, soll eine Warnung gedruckt werden.
*/
fun kontoLoeschen(konto: String) {
    if (konto !in bank) { // bank.containsKey(konto)
        //konto existiert noch nicht
        println("Es existiert kein Konto unter dem Namen '$konto'! ")
    } else {
        //Konto existiert
        val betrag: Double = bank.remove(konto)!!
        println("Das Konto '$konto' wurde erfolgreich entfernt")
        println("Sie erhalten natürlich noch ihr Guthaben von $betrag € zurück.")
    }
}

/*
    TODO:
     Schreibe eine Funktion die eine Auszahlung am Geldautomaten simuliert.
     Nutze einem Parameter name:String, um das richtige Konto auszuwählen und
     einen weiteren für den Geldbetrag, der abgehoben werden soll.

     Berechnet den neuen Betrag und speichert ihn in der map Bank ab.
     Gibt es das Konto nicht soll eine Warnung gedruckt werden.
*/
fun geldAbheben(konto: String, betrag: Double) {

    if (bank.containsKey(konto)) { // konto in bank
        //Konto existiert bereits
        val kontoStand: Double = kontoStand(konto)!!

        if (betrag > 500.0){
            //Auszahlung nicht möglich, da zu hoher Betrag
            println("Auszahlung fehlgeschlagen.")
            println(" Maximaler Betrag: 500.00€")
        } else if(betrag > kontoStand){
            println("Auszahlung fehlgeschlagen. \n Nicht ausreichender Kontostand")
        } else
        {
            //Auszahlung möglich
            bank[konto] = kontoStand - betrag
            // dasselbe: bank[konto] = bank[konto]!! - betrag
            println("Die Auszahlung war erfolgreich. Es sind jetzt noch ${kontoStand(konto)}€ auf dem Konto von $konto")
        }
    } else {
        //konto existiert noch nicht
        println("Es existiert kein Konto unter dem Namen '$konto'! ")
    }
}

/*  TODO:
     Schreibe eine Funktion die eine Einzahlung am Geldautomaten simuliert.
     Nutze einem Parameter name:String um das richtige Konto auszuwählen
     und einen weiteren für den Geldbetrag, der eingezahlt werden soll.
     Berechnet den neuen Betrag und speichert ihn in der map bank ab.
     Gibt es das Konto nicht, wird eine Warnung gedruckt und ein neues Konto angelegt.
*/
fun geldEinzahlen(konto: String, betrag: Double) {
    if (betrag <= 0.0){
        println("Sie müssen einen positiven Betrag einzahlen")
    } else {
        if (konto in bank) {
            //Konto existiert bereits betrag auf bank[konto] addieren
            val neuerKontostand = kontoStand(konto)!! + betrag
            bank[konto] = neuerKontostand
            println("Sie haben erfolgreich $betrag eingezahlt.")
            println(" Ihr neuer Kontostand ist: $neuerKontostand €")
        } else
        {
            //konto existiert noch nicht neues Konto erstellen mit betrag
            println("Das Konto existiert nicht! Es wird ein neues Konto für Sie angelegt")
            kontoHinzufuegen(konto, betrag)
        }
    }
}

/*  TODO:
     Schreibe eine Funktion, die eine Überweisung simuliert.
     Als 1. Parameter soll das konto, von dem aus überwiesen wird, verwendet werden.
     als 2. soll das konto, auf das überwiesen wird, genutzt werden und
     als letzten Parameter den Betrag, der überwiesen werden soll.
     Berechnet die neuen Beträge der beiden Konten und speichert diese wieder in bank ab
 */
fun geldUeberweisen(sender: String, empfaenger: String, betrag: Double) {
    //Prüfung, ob beide Konten existieren
    if (sender in bank && empfaenger in bank) {
        //Prüfung ob konto1 genug Geld hat
        var senderKontostand = kontoStand(sender)!!
        if (senderKontostand >= betrag) {
            //Überweisung
            senderKontostand -= betrag

            // Neue Kontostände abspeichern
            bank[sender] = senderKontostand
            bank[empfaenger] = kontoStand(empfaenger)!! + betrag
            println("Die Überweisung war erfolgreich")
        } else {
            println("Nicht ausreichender Kontostand. Überweisung wurde Storniert")
        }
    }
    else {
        if (sender !in bank){
            println("Es existiert kein Konto '$sender'")
        }

        if (empfaenger !in bank){
            println("Es existiert kein Konto '$empfaenger'")
        }
        println("Überweisung wurde storniert.")
    }
}


/*
    Die restlichen Funktionen sind da, um den Bankautomaten zu implementieren.
 */
fun login(anzahlVersuche: Int = 1){
    println("Willkommen zur Syntax Bank. \n\tLoggen sie sich mit ihrem Namen ein:")
    val konto: String = readln()

    if (konto in bank)
        hauptMenu(konto)
    else {
        println("User nicht gefunden. \n\tMöchten sie ein Konto erstellen? J/N")
        val input = readln().lowercase()
        if (input in listOf("j", "ja", "y", "yes")){
            kontoHinzufuegen(konto)
            hauptMenu(konto)
        } else
            goodbye()
    }
}

fun hauptMenu(konto: String){
    println("""
        Was möchten sie tun?
        [0]     Transaktion beenden
        [1]     Kontostand ablesen
        [2]     Geld abheben
        [3]     Geld einzahlen
        [4]     Geld überweisen
    """.trimIndent())

    var input: String = readln()

    when(input){
        "0" -> goodbye()
        "1" -> {
            println("Ihr aktueller KontoStand: ${kontoStand(konto)}")
            weitereAktionFrage(konto)
        }
        "2" -> {
            println("Geben sie den Betrag zum Abheben ein: (max. 500.0!)")

            try {
                val betrag = readln().toDouble()
                geldAbheben(konto, betrag)

                weitereAktionFrage(konto)
            } catch (ex: Exception){
                ungueltigeEingabe(konto)
            }
        }
        "3" -> {
            println("Wie viel Geld möchten sie einzahlen?")
            try {
                val betrag = readln().toDouble()
                geldEinzahlen(konto, betrag)
                weitereAktionFrage(konto)
            } catch (ex: Exception){
                ungueltigeEingabe(konto)
            }
        }
        "4" -> {
            println("Geben sie den Namen des Empfängers ein:")
            val empfaenger: String = readln()
            println("Wie viel Geld möchten sie überweisen:")
            try {
                val betrag: Double = readln().toDouble()
                geldUeberweisen(konto, empfaenger, betrag)
            } catch (ex: Exception){
                ungueltigeEingabe(konto)
            }
            weitereAktionFrage(konto)
        }
        else -> ungueltigeEingabe(konto)

    }
}

fun goodbye(){
    println("Danke, dass sie Syntax Bank benutzen! \nBis bald :)")
    login()
}

fun weitereAktionFrage(konto: String){

    // Weitere Aktion
    println("Möchten sie eine weitere Aktion ausführen? J / N")
    val input = readln()

    when (input.lowercase()){
        "j", "ja", "y", "yes" -> hauptMenu(konto)
        "n", "nein", "no" -> goodbye()
        else -> {
            println("Ungültige Eingabe")
            weitereAktionFrage(konto)
        }
    }
}

fun ungueltigeEingabe(konto: String){
    println("Ungültige Eingabe")
    hauptMenu(konto)
}