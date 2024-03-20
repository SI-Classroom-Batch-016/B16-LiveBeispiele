package geometrie

open class Form(var color: String, var name: String) {
    open fun info() {
        println("Diese Form hat die Farbe: $color mit dem namen: $name")
    }

}