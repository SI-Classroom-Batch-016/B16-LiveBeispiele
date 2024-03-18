package bank

class Konto (
    val iban: String,
    var pin: String,
    var guthaben: Double = 0.0
) {
}