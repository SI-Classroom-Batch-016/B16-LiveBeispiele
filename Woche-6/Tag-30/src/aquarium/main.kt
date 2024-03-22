package aquarium

// Globale Konstanten schreibt man per Konvention mit CAPS_LOCK
const val SLEEP_TIME: Long = 200 // ms (Millisekunden)


fun main() {

    println(
        """
        -------------------------
        Großes Aquarium:
        
        
        
        
        -------------------------
        """.trimIndent()
    )
    Thread.sleep(SLEEP_TIME * 5)


    var großesAquarium = Aquarium(1500)

    repeat(10) {
        großesAquarium.tiere.add(Goldfisch("Goldie"))
    }

    großesAquarium.tiere.add(Hai("Hainz"))
    großesAquarium.tiere.add(Hai("Haike"))
    großesAquarium.tiere.add(Hai("Haino"))

    großesAquarium.fischeFuettern()
    großesAquarium.wasserWechseln()
    großesAquarium.wasserWechseln()
    großesAquarium.alleTiereFuettern()
    großesAquarium.wasserWechseln()


    //////
    println("""
        ----------------------
        Kleines Aquarium:
        
        ----------------------
        """.trimIndent())
    Thread.sleep(SLEEP_TIME * 5)


    var kleinesAquarium = Aquarium(350)
    kleinesAquarium.tiere.add(Libelle("Bella"))
    kleinesAquarium.tiere.add(Libelle("Bello"))
    kleinesAquarium.tiere.add(Schildkroete("Schiggy"))
    kleinesAquarium.tiere.add(Schildkroete("Schillock"))

    kleinesAquarium.alleTiereFuettern()
    kleinesAquarium.wasserWechseln()


}
