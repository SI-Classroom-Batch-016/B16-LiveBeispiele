package fahrzeuge


class Cabriolet(ps: Int): Auto(ps, 2) {
    var dachOffen: Boolean = false

    fun dachEinAusfahren(){
        dachOffen = !dachOffen
    }

}