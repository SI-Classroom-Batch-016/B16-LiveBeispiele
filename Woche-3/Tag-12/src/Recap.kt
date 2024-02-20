
fun main(){

    namensGenerator()

    var spieler1: Unit = namensGenerator()
    println("Spieler 1: $spieler1")


    val fcBeispiel = getRandomFussballTeam()
    val beispielTV = getRandomFussballTeam()


    var spieler2: String = namensGeneratorReturn()

//    println(name)
    println("Spieler 2: $spieler2")

    var name: String = namensGeneratorReturn()

    zufallsZahl()

    println("--------")
//    // Void Funktionen gehören nicht in ein Println
//    println(namensGenerator())
//    println(zufallsZahl())

    // ------
    kampfRunde()
    kampfRunde()
    kampfRunde()

    println("Pikachu hat noch $pikachuLP / 200")
    println("Gengar hat noch $gengarLP / 200")

    // gewinnerErmitteln()

}

// --------------------------
fun kampfRunde(){
    pikachuAttackenAuswahl()

    Thread.sleep(1500)      // ms müssen in Long angegeben werden

    gengarAttacke()

    Thread.sleep(1500)


    println("------")

}

var gengarLP = 200
var pikachuLP = 200

// Gengar ist das gegnerische Pokemon
fun gengarAttacke(){

    var schaden = (60..80).random()

    pikachuLP -= schaden

    println("Gengar greift Pikachu für $schaden Schaden an.")
    println("Pikachu hat noch $pikachuLP / 200 LP")
}

// Pikachu ist das Pokemon der SpielerIn
fun pikachuAttackenAuswahl(){
    // Spieler soll eine Attacke auswählen
    val pikachuAtks = mutableMapOf(
        "Donnerschock" to 40,
        "Ruckzuckhieb" to 60,
        "Donner" to 120
    )

    val atkNamen = pikachuAtks.keys
    println("Du hast diese Attacken zur Auswahl: $atkNamen")
    println("Geben sie ein:")
    println("1 für ${atkNamen.elementAt(0)}")
    println("2 für ${atkNamen.elementAt(1)}")
    println("3 für ${atkNamen.elementAt(2)}")

    val eingabe = readln()
    val index = eingabe.toInt() - 1

    val attacke = atkNamen.elementAt(index)
    val schaden: Int = pikachuAtks[attacke]!!
    println("Sie haben $attacke gewählt. Diese Attacke macht $schaden Schaden.")

    gengarLP -= schaden
    println("Gengar hat noch $gengarLP / 200")
}

