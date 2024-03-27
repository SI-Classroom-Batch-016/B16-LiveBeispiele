open class Buch(
    val autor : String,
    val seitenzahl : Int,
    val genre : String,
    val verlag : String,
    var titel : String,
    var preis : Double,
    var inhalt : String = "",
    var richtung : Himmelsrichtung = Himmelsrichtung.NORD
) {

//    init {
//        println("Gib bitte den Inhalt ein")
//        this.inhalt = readln()
//    }
    override fun toString(): String {
        return "Titel: $titel, Autor: $autor, Preis: $preis, Inhalt: $inhalt"
    }

    fun lesen() {
        println("$titel wird gelesen")
    }

    fun rabatt(rabatt : Double) {
        this.preis *= rabatt
    }

}