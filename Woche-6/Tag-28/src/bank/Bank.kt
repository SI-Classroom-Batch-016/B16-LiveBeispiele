package bank

class Bank {
    var register: MutableMap<Int, Konto> = mutableMapOf()
    var jahresZins: Double = 0.0
    constructor(register: MutableMap<Int, Konto>, jahresZins: Double) {
        this.register = register
        this.jahresZins = jahresZins
    }
    constructor() : this(jahresZins = 5.0, register = mutableMapOf(0 to Konto("Suppenkasper"))) {

    }

    fun openAccount(name: String) {
        // Konto erstellen
        val konto: Konto = Konto( name)

        // Konto zum Register hinzufügen
        this.register[0] = konto
        // this.register.put(0,konto)
    }

    fun closeAccount(name: String) {
        val konto = this.register.values.find { it.name == name }
    }

    fun geldAbheben(name: String, betrag: Double, pin: Int) {
        val konto = this.register.values.filter { it.name == name }[0]

        if (pin == konto.pin) {
            konto.betrag -= betrag
        } else {
            println("Falsche PIN!!!")
        }
    }
}