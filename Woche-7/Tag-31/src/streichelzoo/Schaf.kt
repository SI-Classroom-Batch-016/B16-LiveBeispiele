class Schaf(
        name: String,
        gewicht: Double,
        alter: Int,
        geschlecht: String = listOf("m", "w").random(),
        var wolleSauber: Boolean = listOf(true, false).random()
) : Tier(name, gewicht, alter, geschlecht) {

    override fun geraeuscheMachen() {
        println("määäh!")
    }

    fun baden() {
        println("Das Schaf $name wurde gewaschen")
        wolleSauber = true
    }
}
