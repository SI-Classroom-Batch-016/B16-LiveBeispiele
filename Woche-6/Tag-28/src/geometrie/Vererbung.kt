package geometrie


fun main() {
    val form: Form = Form("Gelb")
    // form.info()

    val kreis: Kreis = Kreis("Rot", 2)
    println(kreis.flaeche())
    //kreis.info()

    val rechteck: Rechteck = Rechteck("Braun", 4, 2)
    println(rechteck.umfang())
    // rechteck.info()
}