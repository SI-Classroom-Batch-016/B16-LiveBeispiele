package bank

class Bank (
    var standort: String,
    var chef: Mitarbeiter
) {
    val zinsSatz = 0.02
    val kunden: MutableList<Kunde> = mutableListOf()


}