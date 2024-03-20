package geometrie

open class Form(var color: String) {
    open fun info() {
        println("Diese Form hat die Farbe: $color")
    }
}