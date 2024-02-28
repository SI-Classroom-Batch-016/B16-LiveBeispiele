val hauptMenu = listOf(
    "Continue",
    "Neustarten",
    "Auto Auswahl"
)

fun main(){


    // Try Catch für Eingaben
    println("Hauptmenu: $hauptMenu")
    val gewaehlteOption = readIndex(hauptMenu)


    println("Wählen sie eines dieser Autos: \n$autoListe")
    val gewaehltesAuto = readIndex(autoListe)

    println("Du hast diesen Wagen gewählt: \n$gewaehltesAuto")
    println("------------")


    val zahl1 = readDouble() // readln().toDouble()
//    val zahl1 = readln().toDouble()


//    fehlerhafteFunktion()

    // Typischer Aufbau von Try-Catch
    try {                   // Try = Versuche Plan A
        val ergebnis = fehlerhafteFunktion()
        println(ergebnis)
    } catch (ex: NumberFormatException){ // Catch = Plan B
        println("Fehler verhindert")
    } catch (e: NullPointerException){
        println("$e")
        println("${e.message}")
    } catch (fehler: Exception){
        println("Fehler verhindert")
    }

/*    try {

    } catch (ex: Exception){

    }*/


    // Ergebnis nur innerhalb des try-Scopes {}
//    println(ergebnis)




}


fun fehlerhafteFunktion(): String{
    println("Test:")

    val wuerfel = (1..6).random()
    when (wuerfel){
        in 1..4 -> throw Exception("Fehler!!!")
        5, 6 -> println("Erfolg!!")
    }

    return "Wichtig!"

}

fun readDouble(): Double{
    print("Geben Sie eine (Komma-)Zahl ein: ")
    var input: String = readln()
    input = input.replace(",",".")

    var zahl: Double

    try {
        zahl = input.toDouble()
    }
    catch (fehler: Exception){
        println("❗️Du hast die Zahl falsch eingegeben. ")
        println(fehler.localizedMessage)
        println("Versuche es nochmal")
        zahl = readDouble()     // readln().toDouble()
    }
    return zahl
}

fun <T> readIndex(list: List<T>): T {
    println("Wählen sie einen Index zwischen 0 und ${list.lastIndex}: ")

    var input = readln()

    try {
        val index = input.toInt()       // NumberFormatException
        val element = list[index]       // IndexOutOfBoundsException
        return element
    } catch (e: NumberFormatException){
        println("Du hast keine gültige Zahl eingegeben!!\nEs sind nur ganze Zahlen erlaubt")
    } catch (e: IndexOutOfBoundsException){
        println("Du hast einen ungültigen Index eingegeben!!")
        println("Es sind nur Indizes zwischen 0 und ${list.lastIndex} erlaubt")
    } catch (e: Exception){
        println("UNBEKANNTER FEHLER!")
    }

    return readIndex(list)
}