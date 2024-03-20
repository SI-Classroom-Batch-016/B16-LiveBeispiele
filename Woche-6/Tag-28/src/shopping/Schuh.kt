package shopping


class Schuh(var name: String,
            var preis: Double,
            var marke: String,
            var farbe: String,
            var groesse: Double) {

    fun infosAusdrucken() {
        println("""
            Name: $name
            Preis: $preis
            Marke: $marke
            Farbe: $farbe
            Größe: $groesse
        """.trimIndent())
    }

    fun farbWechsel() {
        val farben = listOf("Grün", "Gelb", "Schwarz", "Weiß", "Blau")
        this.farbe = farben.random()
    }

}