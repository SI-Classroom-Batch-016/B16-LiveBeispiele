// JEDE Klasse in eine EIGENE Datei
import kotlin.random.*

// KlassenNamen werden Großgeschrieben
class Person (
    var name: String = "",
    var alter: Int = 0,
    val kinder: MutableList<Person> = mutableListOf(),
) {

    var gehalt: Double = 0.0
    var ehePartner: String = ""

    constructor(name: String, alter: Int, gehalt: Double): this(name, alter, kinder = mutableListOf()){
        this.gehalt = gehalt
    }

    init {
//        println("Geben sie den Ehepartner für $name ein:")
    }

    fun geburtstag(){
        println("Hurra! $name hat heute Geburtstag")
        alter++
    }

    fun beschreibung(){
        println("Ich heiße '$name' und bin $alter Jahre alt.")

        if (kinder.size == 1){
            println("Ich habe ${kinder.size} Kind")
        }
        else if (kinder.size > 1)
            println("Ich habe ${kinder.size} Kinder")
        else
            println("Ich hab keine Kinder")
    }

    fun jahresGehalt(): Double{
        return 12 * this.gehalt
    }

}