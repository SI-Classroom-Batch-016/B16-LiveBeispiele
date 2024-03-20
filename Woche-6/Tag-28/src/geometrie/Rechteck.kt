package geometrie

class Rechteck(color: String, val a: Int, val b: Int, name: String) : Form(color, name) {

    fun flaeche() : Int {
        return a * b
    }

    fun umfang() : Int {
        return 2 * (a + b)
    }
}