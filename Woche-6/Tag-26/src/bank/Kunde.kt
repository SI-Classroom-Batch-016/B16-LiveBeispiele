package bank

class Kunde (
    val name: String,
    var geburtsDatum: String
) {
    val konten: MutableList<Konto> = mutableListOf()

    fun kontoEroeffnen(){}

    fun geldAbheben(){}

}