class Huhn(
    name: String,
    gewicht: Double,
    alter: Int,
    geschlecht: String,
    // kein var -> parameter für den Konstruktor
    anzahlEierProTag: Int = (1..2).random()
) : Tier(name, gewicht, alter, geschlecht) {

    // var -> Eigenschaft
    var anzahlEierProTag: Int

    init {
        if (geschlecht == "Weiblich")
            this.anzahlEierProTag = anzahlEierProTag
        else
            this.anzahlEierProTag = 0
    }

    override fun geraeuscheMachen() {
        println("ga-gack")
    }


}