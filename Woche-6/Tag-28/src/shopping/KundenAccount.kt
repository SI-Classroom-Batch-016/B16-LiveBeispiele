package shopping


class KundenAccount {
    var username: String = ""
    var email: String
    var passwort: String
    var guthaben: Double = 0.0
    var warenkorb: MutableList<Schuh> = mutableListOf()

    constructor(email: String, passwort: String) {
        this.email = email
        this.passwort = passwort
    }

    fun gesamtPreis() : Double {
        var gesamtPreis = 0.0

        for (schuh in warenkorb) {
            gesamtPreis += schuh.preis
        }

        return gesamtPreis

        //return warenkorb.sumOf { it.preis }
    }
}
