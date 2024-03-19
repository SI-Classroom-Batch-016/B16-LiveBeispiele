import kotlin.random.Random

class Produkt {
    var artikelName: String
    var preis: Double
    var anzahl: Int = 0

    constructor(name: String, preis: Double, anzahl: Int){
        this.artikelName = name
        this.preis = preis
        this.anzahl = anzahl
    }

    constructor(name: String, preis: Double){
        this.artikelName = name
        this.preis = preis
        this.anzahl = 0
    }

    constructor(name: String){
        this.artikelName = name
        println("Geben sie den Preis für $name ein:")
        this.preis = readln().toDouble()

        println("Geben sie die Anzahl für $name ein:")
        this.anzahl = readln().toInt()
    }

    /* Zufallsgenerator:
    constructor(){
        this.artikelName = namensListe().random()
        this.preis = Random.nextDouble(1.0, 3.0)
        this.anzahl = (0..10).random()
    }
*/

}