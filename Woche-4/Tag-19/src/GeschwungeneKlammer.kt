// Globale Variablen
val vorNamen = listOf(
    "Emilia",
    "Hanna/Hannah",
    "Sophia/Sofia",
    "Emma",
    "Mia",
    "Mila",
    "Lina",
    "Ella",
    "Klara/Clara",
    "Lea/Leah",
    "Noah",
    "Matteo",
    "Leon",
    "Finn",
    "Paul",
    "Luca/Luka",
    "Elias",
    "Emil",
    "Felix",
    "Louis/Luis"
)
val nachNamen = listOf(
    "Müller",
    "Schmidt",
    "Schneider",
    "Fischer",
    "Weber",
    "Meyer",
    "Wagner",
    "Becker",
    "Schulz",
    "Hoffmann",
    "Schäfer",
    "Bauer",
    "Koch",
    "Richter",
    "Klein",
    "Wolf",
    "Schröder",
    "Neumann",
    "Schwarz",
    "Braun",
    "Hofmann",
    "Zimmermann"
)

/* Scope:
    - alle Namen, die innerhalb von geschwungenen Klammern erstellt werden,
    existieren nur in diesem Kontext (=Scope)!
    - Verzweigte Funktionen brauche in allen Fällen ein Return

   Einklappbar:
    - IntelliJ erlaubt uns Code innerhalb von (geschwungenen) Klammern zu verstecken
 */
fun main() {
    val beispielName = zufallsNamen()

    var ergebnis = "${listOf(2,3,4,5,6,7).random()}" // -> "11"

    println("Name: $beispielName")
    println("Alter: ${altersEingabe()}")    // geschwungene Klammer für Code Block innerhalb Strings
}

/*
Funktionen
   ! Vorsicht: RückgabeWerte müssen in allen Zweigen einer Funktion returned werden
*/
fun zufallsNamen(zweitname: Boolean = true): String {   // Geschwungene Klammer für Funktionsrumpf
    var vollName: String =
        if (zweitname) {       // geschwungene Klammer für If - Block
            val vorname1 = vorNamen.random()
            val vorname2 = vorNamen.random()
            "$vorname1 $vorname2 ${nachNamen.random()}"  // geschwungene Klammer für Code Block innerhalb Strings
        } else {      // geschwungene Klammer für Else - Block
            "${vorNamen.random()} ${nachNamen.random()}" // geschwungene Klammer für Code Block innerhalb Strings
        }

//    if (){}
//    else {}

    return vollName
}

fun <T> allgemeineFunktion() {
    val ergebnis: T

//    return ergebnis
}

fun testFunktion(): Boolean {
    var ergebnis: Boolean = listOf(false, true).random()
    return ergebnis
}


fun altersEingabe(): Int {   // Geschwungene Klammer für Funktionsrumpf

    var alter: Int

    try {   // Geschwungene Klammer für Try-Block
        println("Bitte geben sie ihr Alter an: ")
        alter = readln().toInt()
        return alter
    }
    catch (ex: Exception) { // Geschwungene Klammer für Catch-Block
        println("Alter wurde falsch eingegeben")
        return altersEingabe()
//        alter = altersEingabe()
    }
//    return alter

    /* try {

     } catch (e: Exception){

     }*/
}