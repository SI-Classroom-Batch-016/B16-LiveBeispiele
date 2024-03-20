package geometrie

class Rechteck(color: String, val a: Int, val b: Int) : Form(color) {

    fun flaeche() : Int {
        return a * b
    }

    fun umfang() : Int {
        return 2 * (a + b)
    }
}