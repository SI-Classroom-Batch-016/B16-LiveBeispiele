package fahrzeuge


// Basisklasse muss als offen definiert werden
open class Fahrzeug(val ps: Int){

    var motorAn: Boolean = false
    var aktuelleGeschwindigkeit: Int = 0


    open fun beschleunigen(){
        this.aktuelleGeschwindigkeit += 5
    }

    fun bremsen(){
        this.aktuelleGeschwindigkeit -= 5
    }

}