class Pizza {
    val name: String
    var preis: Double
    var groesse: Int

    init {
        println("Wählen sie Größe ihrer Pizza:")
        groesse = readln().toInt()
    }

    constructor(){
        this.name = "Mozzarella"
        this.preis = 13.99
    }

}

fun main(){
    val pizza1 = Pizza()
    pizza1.groesse
}