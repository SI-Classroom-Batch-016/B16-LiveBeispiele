class Streichelzoo {
    var tiere: MutableList<Tier> = mutableListOf(
        Kuh("Berta", 700.0, 4),
        Schaf("Shawn", 150.0, 4, wolleSauber = false),
        Pony("Xavier", 400.0, 4, "Männlich", 15.0),
        Pony("Ilse", 350.0, 4, "Weiblich", 17.0),
        Huhn("Samuel", 4.0, 2, "Männlich"),
        Huhn("Ulla", 3.0, 2, "Weiblich", 2)
    )
    var besucher: MutableList<Besucher> = mutableListOf()

    private val besucherLimit: Int = 5

    fun neuerBesucher(b: Besucher) {
        b.vorstellen()
        if (besucher.size < besucherLimit) {
            besucher.add(b)
            println("Herzlich Willkommen in unserem Zoo '${b.name}', du bist der ${besucher.size}te Besucher!")
            tiereUndIhreGeraeusche()
        } else
            println("Tut uns leid, '${b.name}. Leider ist der Streichelzoo bereits voll")
    }

    fun exit(b: Besucher) {
        if (besucher.contains(b)) {
            besucher.remove(b)
            println("Auf Wiedersehen '${b.name}'!")
        } else {
            println("Der Besucher '${b.name}' ist gar nicht im Zoo!")
        }
    }

    private fun tiereUndIhreGeraeusche() {
        println()
        for (tier in tiere) {
            tier.geraeuscheMachen()
        }
    }

    fun rennen(pony1: Pony, pony2: Pony) {
        if (pony1.geschwindigkeit > pony2.geschwindigkeit) {
            println("${pony1.name} hat das Rennen gewonnen!")
        } else if (pony1.geschwindigkeit < pony2.geschwindigkeit) {
            println("${pony2.name} hat das Rennen gewonnen!")
        } else {
            println("Beide waren gleich schnell! Unentschieden!")
        }
    }

}