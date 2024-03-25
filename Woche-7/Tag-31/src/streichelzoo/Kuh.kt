class Kuh : Tier {
    // Einfach zur demonstration: Sekundärer Konstruktor
    // Besser: Direkt als primärer
    constructor(name: String, gewicht: Double, alter: Int, geschlecht: String = listOf("m", "w").random()) :
            super(name, gewicht, alter, geschlecht) {
    }

    // gibtMilch ist bereits festgelegt
    // gibtMilch = alter >= 3 && geschlecht == "Weiblich"
    val gibtMilch: Boolean
        get(){
            return alter >= 3 && geschlecht == "Weiblich"
        }


    override fun geraeuscheMachen() {
        println("Muuuuhh")
    }

    fun melken(besucher: Besucher) {
        if (gibtMilch) {
            println("'${besucher.name}' melkt $name und erhält einen Eimer voll Milch!")
        } else {
            println("$name schaut '${besucher.name}' komisch an. Hier gibt es keine Milch zu holen.")
        }
    }
}