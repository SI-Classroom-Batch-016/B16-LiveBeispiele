package geometrie

class Kreis(color: String, val r: Int, name: String) : Form(color, name) {

    override fun info() {
        // super.info()
        println("Dieser Kreis hat die Farbe: $color mit namen: $name")
    }

    fun flaeche() : Double {
        super.info()
        return Math.PI * r * r
    }

    fun umfang() : Double {
        return Math.PI * r * 2
    }
}

