fun main() {
    /*
        Dieses kleine Programm simuliert einen Registrierungsprozess:
            Zuerst fragt es nach einem Usernamen,
            dann ein Passwort
            Als Letztes wird eine Bestätigung ausgedruckt.
     */

    // User abfragen
    println("Username: (bestätigen mit Enter)")
    var username: String = readln()

    // Passwort abfragen
    println("Password: ")
    val pw = readln()

    // Bestätigung
    println("Ihr neuer Account wurde erstellt mit den folgenden Daten: \n Username: $username \n Passwort: $pw")

}

