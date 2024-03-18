class Fahrzeug {
    var aktuelleGeschwindigkeit = 0

    fun beschleunigen(){
        aktuelleGeschwindigkeit++
    }

    fun bremsen(){
        aktuelleGeschwindigkeit--
    }

    fun notbremse(){
        while(aktuelleGeschwindigkeit > 0)
            bremsen()
    }
}