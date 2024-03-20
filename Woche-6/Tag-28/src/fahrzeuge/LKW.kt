package fahrzeuge



class LKW(ps: Int): Fahrzeug(ps) {

    override fun beschleunigen(){       // override = "überschreiben"
        this.aktuelleGeschwindigkeit += 3
    }


    fun beladen(){

    }



}