package bank

class Sparkonto(val zinsSatz: Double = 0.05): Konto() {

    override fun geldAbheben() {
        println("Von einem Sparkonto kann man kein Geld abheben.")
    }

}