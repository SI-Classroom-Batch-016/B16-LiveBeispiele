import kotlin.jvm.internal.Intrinsics.Kotlin
import kotlin.random.Random

class Pony(name: String, gewicht: Double, alter: Int, geschlecht: String,
           var geschwindigkeit : Double) : Tier(name, gewicht, alter, geschlecht) {

    override fun geraeuscheMachen(){
        println("Wiehhiehie")
    }

    override fun fuettern(besucher: Besucher) {
        println("'${besucher.name}' hält $name eine Karotte und ein Zuckerstück hin")

        if (Random.nextBoolean()) {
            println("$name frisst die Karotte. Die Karotte sah zu knackig aus")
        } else {
            println("$name verschlingt das Zuckerstück. Etwas Süßes geht immer")
        }
        gewicht *= 1.02
    }

    fun reiten(besucher : Besucher) {
        if(besucher.alter >= 6 && alter >= 1) {
            println("'${besucher.name}' reitet nun auf $name und fühlt sich wie ein Ritter!\n" +
                    " Sie erreichen ein Tempo von $geschwindigkeit km/h!")
        } else {
            print("Tut mir leid '${besucher.name}' :( .")

            if (besucher.alter < 6)
                println("Du bist leider noch zu jung zum Reiten")
            else
                println("Das Pony ist leider noch zu jung um geritten zu werden.")
        }
    }

}