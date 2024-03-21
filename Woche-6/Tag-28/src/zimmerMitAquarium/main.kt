package zimmerMitAquarium

import zimmerMitAquarium.fisch.Goldfisch
import zimmerMitAquarium.fisch.Hai

fun main() {
    var aquarium = Aquarium(50)

    var goldi = Goldfisch("goldi")
    var bruce = Hai("Bruce")
    var libi = Libelle("libi")
    aquarium.tiere.addAll(listOf(goldi, bruce, libi))

    //aquarium.alleTiereFuettern()
    aquarium.fischeFuettern()
    aquarium.wasserWechseln()

    bruce.essen(goldi)
    libi.essen()
    aquarium.tiere.remove(goldi)
    var text: String = "15"

}