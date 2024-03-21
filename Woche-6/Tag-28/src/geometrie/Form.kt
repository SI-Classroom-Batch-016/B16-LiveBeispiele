package geometrie

open class Form(protected var color: String, protected var name: String) {
    open fun info() {
        println("Diese Form hat die Farbe: $color mit dem namen: $name")
    }

}