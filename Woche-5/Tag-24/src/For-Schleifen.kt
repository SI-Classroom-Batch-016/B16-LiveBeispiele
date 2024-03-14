

fun main(){

    var sortiment: MutableMap<String, Double> = mutableMapOf(
        "Apfel" to 0.40,
        "Mars" to 1.99,
        "Cola" to 2.50,
        "Banane" to 0.4,
    )

    /*for (...){

        try {

        } catch (e: IndexOutOfBoundsException){

        }

    }*/



    for (i in sortiment){
        var name = i.key
        var preis: Double = i.value

        if (name == "Apfel" || name == "Banane")
            continue

        preis += 0.5
        sortiment[name] = preis
    }

    for ((name, preis) in sortiment){
        println("$name kostet $preis")
    }

    println("-----")

    sortiment.forEach { i ->
        println("${i.key} kostet ${i.value}")
    }

    sortiment.forEach { (name, preis) ->
        println("${name} kostet ${preis}")
    }

    println("------")
    sortiment.count { (name, preis) ->
        if (preis < 1.0)
            println("$name kostet $preis")
        preis < 1.0
    }

    println("----")
    var anzahl = 0
    sortiment.forEach { (name, preis) ->        // for ((name, preis) in sortiment)
        if (preis < 1.0) {
            println("$name kostet $preis")
            anzahl ++
        }
    }
    println("Es waren $anzahl Produkte weniger als 1€")



    var listeMitZahlen = listOf<Int>()

    for (it in listeMitZahlen)
        println()
    
    listeMitZahlen.count {
        true
    }


}