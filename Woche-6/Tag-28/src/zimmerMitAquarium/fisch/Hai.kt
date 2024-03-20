package zimmerMitAquarium.fisch

class Hai(spitzname: String): Fisch(spitzname) {
    fun essen(fisch: Fisch) {
        print("${this.spitzname} isst gerade ${fisch.spitzname}")
    }
}