fun main(){

    val geburtsJahr: Int = 1990
    var aktuelleJahr: Int = 2023

    aktuelleJahr = 2024

    // Ergebnis muss abgespeichert werden, sonst geht es verloren
//        aktuelleJahr - geburtsJahr
    var alter: Int = aktuelleJahr - geburtsJahr

    // Ergebnis wird nicht automatisch angezeigt
    println("Die Person ist $alter Jahre alt.")
//    println("Die Person ist ${aktuelleJahr - geburtsJahr} Jahre alt.")


    // Computer rechnet Punkt-vor-Strich
    var ergebnis1 = 4 * 5 + 6
    var ergebnis2 = 4 * (5 + 6)
    var ergebnis3 = 6 + 4 * 5

    println("Ergebnis 1: $ergebnis1")
    println("Ergebnis 2: $ergebnis2")
    println("Ergebnis 3: $ergebnis3")   // cmd + d

    // Geteilt durch 0 ist nicht erlaubt -> gibt eine Exception (Laufzeitfehler)
//    var ergebnis4 = 6 / (5-5)
//    println("Ergebnis 4: $ergebnis4")

    // Beispiel für Modulo
    var sekunden = 230
    print("$sekunden sekunden sind insgesamt: ")
    var minuten = sekunden / 60
    sekunden %= 60      // sekunden = sekunden % 60
    println("$minuten min: $sekunden s")



    var divident: Int = 5       // zähler
    var divisor: Int = 2        // teiler

    var bruch: Int = divident / divisor
    var rest: Int = divident % divisor
    println("$divident / $divisor = $bruch")
    println("$divident % $divisor = $rest")

    divident = 20
    bruch = divident / divisor
    println("$divident / $divisor = $bruch")
    rest = divident % divisor
    println("$divident % $divisor = $rest")



    // Andere Zuweisungsoperatoren
    // Zuweisungsoperator inkl. Rechenoperation

    alter = 50
    alter += 1  // alter = alter + 1
    alter ++    // genau das selbe
    alter --
    alter *= 2
    alter /= 2  // alter = alter / 2
    alter = alter / 2

    alter = 25
    alter += 1      // alter = alter + 1
    alter ++        // alter += 1
    alter -= 5 + 5  // alter = alter - 10
    println("Das Alter nach den Rechnungen ist jetzt: $alter")

    alter = 25
    // diese drei Zeilen sind nicht dasselbe
    alter -= 10     // Diese Zeile rechnet das Alter - 10 und speichert das Ergebnis
    alter - 10      // Diese rechnet das Alter - 10         -> niemals so programmmieren
    alter = 10      // Hier wird das Alter einfach auf 10 gesetzt


    // Zweites Beispiel dafür
    var kontostand: Double = 5612.78
    var preis: Double = 2.50

    kontostand - preis      // kontostand wird nicht aktualisiert
    kontostand -= preis


    // Rechnen mit Double
    var result1 = 5 / 7
    println("Result 1: $result1")

    var result2 = 5.0 / 7.0
    println("Result 2: $result2")

    var result3 = 1.0 / 3.0
    println("Result 3: $result3")

    // Ein int verrechnet mit einem Double ist immer ein Double
    var result4 = 4 * 5.0
    println("Result 4: $result4")

    var result5 = 2.5 * 2
    println("Result 5: $result5")


    // Mit Strings kann man nicht rechnen
//    var result6 = "7" - "6"

    // Mit + kann man Strings kombinieren
    var fullName = "Gordon" + " " + "Lucas"
//    fullName = "Mario " + "Maier"
//    fullName += "test"


}