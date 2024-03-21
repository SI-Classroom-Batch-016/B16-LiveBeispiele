package privatePublic

fun main(){
    val konto1 = Konto("Gordon Lucas",
        5000.0,
        "6666"
    )

    val konto2 = Konto("Marianne Leal",
        9999.0,
        "1234"
    )
    konto1.getKontostand()
    // Kontostand auf private gesetzt -> nicht mehr bearbeitbar
//    konto1.kontostand = 100000.0
//    konto1.kontostand += konto2.kontostand
//    konto2.kontostand = 0.0

    // PIN private gesetzt -> diese Fehler nicht mehr möglich
//    println(konto2.PIN)
//    konto2.PIN = "4321"

    // Weiterhin möglich
    //konto2.pinAendern()



}