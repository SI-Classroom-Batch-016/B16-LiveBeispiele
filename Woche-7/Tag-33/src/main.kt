fun main() {
    val buch : Buch = Buch("test",10,"test","test","test",20.0)
    val buch2 : Buch = Buch("test",10,"test","test","test",20.0)
    val comic : Comic = Comic("test",10,"test","test","comic",20.0,"bilder")
    println(buch)
    println(buch2)
    buch.titel = "test2"
    buch.rabatt(0.5)
    println(buch)
    println(buch2)

    buch.lesen()

    when(buch.genre) {
        "Krimi" -> println("Mein Buch ist ein Krimi")
        "Roman" -> println("Mein Buch ist ein Roman")
        else -> println("undefiniert")
    }

    val buecher : List<Buch> = listOf(buch,buch2,comic)

    val richtung : Himmelsrichtung = Himmelsrichtung.NORD
    println(richtung)

    when(richtung) {
        Himmelsrichtung.NORD -> println("Norden")
        Himmelsrichtung.OST -> println("Osten")
        Himmelsrichtung.SUED -> println("Süden")
        Himmelsrichtung.WEST -> println("Westen")
    }



//    val comics = buecher.filter { it !is Comic }
//    println(comics)
}