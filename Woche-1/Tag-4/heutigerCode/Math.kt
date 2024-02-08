// Importiert alles aus dem Math Package
import kotlin.math.*
// Wichtige Konstanten
import kotlin.math.PI       // Kreiszahl PI



fun main(){

    /*
        TODO:
         Wir haben Flasche mit 1 Liter Inhalt (1000cm³).
         Wir schätzen die Flasche ist 40cm hoch.
         Wir wollen ausrechnen was ist der Radius des Kreises am Boden der Flasche,
            damit wir einen passenden Flaschenhalter bauen können.

         Formel für das Volumen von einem Zylinder: V = pi * r² * h
         Um den Radius des Bodens zu berechnen:    r = √(Volume / (π * height))
     */

    val V = 1000.0
    val h = 40.0
    val r = sqrt((V / (PI * h)))
    println("Die Flasche hat einen Radius von $r cm. ")



    // Rundungen
    println("PI gerundet ist ${round(PI)}")         // Rundet nur zur nächsten Ganzzahl, aber immer noch Double
    println("PI gerundet ist ${PI.roundToInt()}")   // Rundet zu Int


    val zuRundendeZahl = 3.99
    println("$zuRundendeZahl gerundet ist ${round(zuRundendeZahl)}")         // Rundet nur zur nächsten Ganzzahl, aber immer noch Double
    println("$zuRundendeZahl gerundet ist ${zuRundendeZahl.roundToInt()}")   // Rundet zu Int

    /*
        Für eine Rundung auf eine bestimmte Anzahl Kommastellen
        müssen wir anders vorgehen:
         - Für 1 Kommastelle:   zahl mal 10  -> runden -> geteilt durch 10
         - Für 2 Kommastellen:  zahl mal 100 -> runden -> geteilt durch 100   (100 = 10 * 10 = 10 hoch 2)
         - Für 3 Kommastellen:  zahl mal 1000-> runden -> geteilt durch 1000   (1000 = 10 * 10 * 10 = 10 hoch 3)
         -> allgemein:
           Für x Kommastellen:  zahl mal 10^x -> runden -> geteilt durch 10^x
     */

    println("Kommastellen eingeben: ")
    val kommaStellen = readln().toInt()
    val factor: Double = 10.0.pow(kommaStellen)    // .pow Funktion funktioniert nur für Double, nicht int

//    val piGerundet = (PI * factor).roundToInt() / factor
    val piGerundet = round(PI * factor) / factor
    println("Pi ungerundet: $PI")
    println("PI gerundet ist $piGerundet")

    // Eine eingegebene Zahl runden:
    println("Zahl eingeben, die gerundet werden soll:")
    val eingabe = readln().toDouble()
    val eingabeGerundet = (eingabe * factor).roundToInt() / factor
    println("$eingabe gerundet ist $eingabeGerundet")
}