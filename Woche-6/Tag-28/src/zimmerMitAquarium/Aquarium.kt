package zimmerMitAquarium

import zimmerMitAquarium.fisch.Fisch

class Aquarium(val kapazität: Int) {
    var wasserSauber: Boolean = true
    var tiere: MutableList<Tier> = mutableListOf()

    fun fischeFuettern() {
        tiere.forEach { tier ->
            if (tier is Fisch) println("Fisch wird gefüttert")
        }
    }

    fun alleTiereFuettern() {
        tiere.forEach { tier ->
            println("${tier.spitzname} wird gefüttert")
        }
    }

    fun wasserWechseln() {
        println("$kapazität Liter werden gewechselt")
    }

}