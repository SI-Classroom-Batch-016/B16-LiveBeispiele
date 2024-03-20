package bank

class Konto {
    var name: String = ""
    var betrag: Double = 0.0
    var pin: Int = 0

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, betrag: Double) {
        this.name = name
        this.betrag = betrag
    }

    fun pinAendern(altePin: Int, neuePin: Int) {
        if (altePin != pin) {
            println("Hey, du hast die Karte gestohlen")
        } else {
            this.pin = neuePin
        }
    }
 }