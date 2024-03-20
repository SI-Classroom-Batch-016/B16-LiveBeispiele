package geometrie


fun main() {
    val form: Form = Form("Gelb", "superform")
    // form.info()

    val kreis: Kreis = Kreis("Rot", 2, "klasse ding")
    println(kreis.flaeche())
    //kreis.info()

    val rechteck: Rechteck = Rechteck("Braun", 4, 2, "Rechter Winkel und so")
    println(rechteck.umfang())
    // rechteck.info()
    checkFormForInstance(kreis)
    checkFormForInstance(rechteck)
}

fun checkFormForInstance(form: Form) {
    when(form) {
        is Kreis -> {
            println("form ist kreis")
        }
        is Rechteck -> {
            println("form ist rechteck")
        }
    }
}