package bank

class Kreditkonto(val limit: Double = 1000.0): Konto() {

    override fun geldAbheben() {
        super.geldAbheben()
    }
}