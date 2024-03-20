package geometrie

class Kreis(color: String, val a: Int) : Form(color) {

    override fun info() {
        // super.info()
        println("Dieser Kreis hat die Farbe: $color")
    }

    fun flaeche() : Double {
        super.info()
        return Math.PI * a * a
    }

    fun umfang() : Double {
        return Math.PI * a * 2
    }
}

