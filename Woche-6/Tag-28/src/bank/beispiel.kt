package bank

fun main() {

    val konto1 = Konto("Tom Cruise", 1000.00)
    val konto2 = Konto("Marcus Smart", 2000.00)

    konto1.pinAendern(0, 1234)

    val bank = Bank(
        mutableMapOf(
            0 to konto1,
            1 to konto2
        ), 4.5
    )
    val register = mutableMapOf<Int, Konto>(
        1 to Konto("konto1", 100.01),
        2 to Konto("konto2", 12345.67)
    )
    register[1]?.pinAendern(0, 6666)
    register[2]?.pinAendern(0, 1212)
    val syntaxBank: Bank = Bank(register = register, jahresZins = 0.02)

    bank.geldAbheben("Tom Cruise", 900.00, 1234)
    println(konto1.betrag)

}