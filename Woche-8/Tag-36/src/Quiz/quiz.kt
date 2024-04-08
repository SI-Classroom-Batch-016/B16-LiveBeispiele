package Quiz


const val ANZAHL_RUNDEN = 2
val alleFragen = mutableListOf<Frage>(
    /*
    Frage("",
        Kategorie.Musik,
        ,
        listOf()),
     */
    Frage("In Kotlin was bedeutet der Begriff 'Parameter?'",
        Kategorie.Kotlin,
        "Input für eine Funktion",
        listOf("Input für eine Funktion","Output einer Funktion", "Ergebnis einer Funktion", "Name einer Funktion")
    ),
    Frage("Was ist der erste Index einer Liste in Kotlin?",
        Kategorie.Kotlin,
        "0",
        listOf("0", "1", "-1", "list.first()" )),
    Frage("Was ist der letzte Index einer Liste in Kotlin?",
        Kategorie.Kotlin,
        "list.size - 1",
        listOf("list.lastIndex - 1", "list.size - 1", "list.last()", "list.indices")),
    Frage("In Kotlin was bedeutet der Begriff 'return value'?",
        Kategorie.Kotlin,
        "Rückgabewert",
        listOf("Rückgabewert","Parameter", "Argument", "Funktionsaufruf")
    ),
    Frage("Jeder Parameter einer Kotlin-Funktion muss beim Funktionsaufruf mit einem Argument bewertet werden?",
        Kategorie.Kotlin,
        "Ja, außer es gibt einen Default-Wert",
        listOf("Ja", "Nein", "Ja, außer es gibt einen Default-Wert", "Nein, außer es gibt einen Default-Wert")
    ),
    Frage("Welcher dieser Datentypen ist kein gültiger Rückgabewert in Kotlin?",
        Kategorie.Kotlin,
        "Void",
        listOf("Void","String", "List", "MutableList")
    ),
    Frage("Eine Klasse braucht immer mindestens einen Parameter im Primären Konstruktor?",
        Kategorie.Kotlin,
        "Nein",
        listOf("Nein","Ja", "Nein, aber in Sekundären Konstruktoren", "Ja, außer sie erbt von einer anderen Klasse")
    ),
    Frage("Wie viele Methoden kann eine Klasse in Kotlin besitzen?",
        Kategorie.Kotlin,
        "beliebig viele",
        listOf("0","1", "7 + Konstruktoren", "beliebig viele")
    ),
    Frage("In Kotlin braucht jede Klasse genau eine Eigenschaft?",
        Kategorie.Kotlin,
        "Nein",
        listOf("Ja", "Nein", "Ja, außer sie erbt von einer anderen Klasse", "nein, außer ")
    ),
    Frage("Was ist die Hauptstadt von Deutschland?",
        Kategorie.Geographie,
        "Berlin",
        listOf("Berlin", "München", "Frankfurt", "Bonn")
    ),

    Frage("Welche dieser Flaggen symbolisiert Frankreich?",
        Kategorie.Geographie,
        "🇫🇷",
        listOf("🇷🇺","🇫🇷","🇵🇭", "🇨🇱")
    ),
    Frage("Wie hieß der Sänger der Band 'Nirvana'?",
        Kategorie.Musik,
        "Kurt Cobain",
        listOf("Kurt von Bein", "Kunter Bunt", "Kurt Cobain", "Kurt Klostein")
    ),
    Frage("In Welchem Jahr erschien die 'Nena' Single '99 Luftballons?",
        Kategorie.Musik,
        "1983",
        listOf("1983", "1999", "2003", "1979"))
)

val alleSpieler = mutableListOf<Spieler>()

fun main(){
    spielStart()

    println()
    println("NUN KANN ES RICHTIG LOS GEHEN!")
    println()

    repeat(ANZAHL_RUNDEN){
        println("\tRUNDE ${it + 1}:")
        for (spieler in alleSpieler.shuffled()){

            println()
            val zufallsFrage = alleFragen.random()
            zufallsFrage.frageAnzeigen()

            spieler.jokerEinsetzen(zufallsFrage)
            // TODO: Spieler könnte Joker einsetzen
            zufallsFrage.frageBeantworten(spieler)

            alleFragen.remove(zufallsFrage)

        }
    }

    gewinnerErmitteln()

    println()
    println("DANKE fürs Mitspielen und bis zum NÄCHSTEN MAL 👋🏻")
}

fun spielStart(){
    println("WILLKOMMEN IM SYNTAX QUIZ!")

    print("Wählen sie die Anzahl der Spieler: ")
    val nrPlayers = readln().toInt()
    println("-------")

    repeat(nrPlayers){
        println()
        println("Spieler ${it +1} geben sie ihren Namen ein:")
        val name = readln()
        alleSpieler.add(Spieler(name))
    }
    println("-------")
}

fun gewinnerErmitteln(){
    println("Der FINALE ENDSTAND: ")
    println("___________________")

    alleSpieler.sortBy { it.punkte }

    val platzierung = alleSpieler.groupBy { it.punkte }


    for ((punkte, spielerListe) in platzierung){
        repeat(punkte){
            print("|")
        }
        println(" $punkte Punkt${if(punkte != 1) "e" else ""}: ${spielerListe.joinToString(", ", transform = {it.name})}")
    }
    println("___________________")

}