package fahrzeuge

open class Auto(ps: Int, var nrSitze: Int): Fahrzeug(ps) {
    
    override fun beschleunigen() {
        super.beschleunigen()
        this.aktuelleGeschwindigkeit += 1
    }

}