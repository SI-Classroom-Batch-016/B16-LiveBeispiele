
fun main(){

    val autoHaus = mapOf(
        "Ferrari" to 2000000.0,
        "VW Golf 1" to 2000.0,
        "VW Bus" to 50000.0,
        "VW Golf 2" to 2500.0,
        "Honda Civic" to 4000.0
    )


    // .contains -> "Suche"
    println("Nach welchem Auto suchen sie?")
    val suchfeld = readln()

    var gibtEsAuto: Boolean = false

    /*
       Alle Autos der Reihe nach durchgehen
            überprüfen: ist das gesuchte Auto dabei
     */

    for (auto in autoHaus){
        val autoName = auto.key
        val autoPreis = auto.value
    }
//    for ((autoName, _) in autoHaus){
    for (autoName in autoHaus.keys){
        if (autoName == suchfeld || autoName.contains(suchfeld)){
            gibtEsAuto = true
            break
        }
    }

    repeat (autoHaus.size){ it ->
        val autoName = autoHaus.keys.elementAt(it)
        if (autoName == suchfeld || autoName.contains(suchfeld)){
            gibtEsAuto = true
        }
    }

    var index = 0
    while (index < autoHaus.size){
        val autoName = autoHaus.keys.elementAt(index)
        if (autoName == suchfeld || autoName.contains(suchfeld)){
            gibtEsAuto = true
        }
        index++
    }

    println("Wir verkaufen $suchfeld ? $gibtEsAuto")

    // Filter

    /*
        zweiteListe = leereListe
        der Reihe nach mit den gefilterten Autos füllen
     */
    val gefiltertesAutohaus = mutableMapOf<String, Double>()

    for ((autoName, autoPreis) in autoHaus) {
        if (autoName == suchfeld || autoName.contains(suchfeld)) {
            gefiltertesAutohaus[autoName] = autoPreis
        }
    }


    println("Alle Gefundenen Autos: ")
    for ((autoName, autoPreis) in gefiltertesAutohaus){
        println("$autoName für $autoPreis €")
    }



    // nach Preis filtern
    gefiltertesAutohaus.clear()

    val maxPreis: Double = 4000.0

    for ((autoName, autoPreis) in autoHaus) {       // was wollen wir Filtern (hier: das Autohaus)
        if (autoPreis <= maxPreis) {        // Filter kriterium
            gefiltertesAutohaus[autoName] = autoPreis
        }
    }
    println("Alle Gefundenen Autos, die weniger als 4000.0 kosten: ")
    for ((autoName, autoPreis) in gefiltertesAutohaus){
        println("$autoName für $autoPreis €")
    }

    fun preisGroeßerMax(preis: Double): Boolean{
        return preis <= maxPreis
    }

    autoHaus.filter{preisGroeßerMax(it.value)}
    autoHaus.filter { it.value <= maxPreis }



    listOf<String>().forEachIndexed { index, s ->  }


}




fun zahlEinlesen(): Double {
    var eingabe = readln()

    try {
        val zahl = eingabe.toDouble()
        return zahl
    } catch (fehler: Exception){
        println("Fehler bei Eingabe")
        return zahlEinlesen()
    }

}
