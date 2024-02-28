// Ein Auto besteht aus Modell, Preis, Reichweite (in km/L)
val auto1: Triple<String, Double, Double> = Triple("VW Golf", 2000.0, 6.0 )
val auto2 = Triple("Ford Focus", 1800.0, 5.5)
val auto3 = Triple("Toyota Corolla", 2200.0, 7.2)
val auto4 = Triple("VW Passat", 2500.0, 5.8)
val auto5 = Triple("Honda Civic", 1900.0, 6.5)
var autoListe = listOf(auto1, auto2, auto3, auto4, auto5)

/*
if ()...
else if ()...
else if ()...
else ...


if ()...
else ...

if (){
    if (){...}
    else ...
}
else ...

...

when (...){
    1, 2 -> ...
    3 -> ...
    4 -> ...
    else ->
}*/


fun main(){

    // TODO: 3 Filter für Auto:

    // Marke
    val wunschMarke = "VW"
    var autosMitWunschMarke = filterByMarke(wunschMarke)
    println("Die Autos mit der gewünschten Marke sind: ")
    println(autosMitWunschMarke)

    autosMitWunschMarke = autoListe.filter { auto ->  wunschMarke in auto.first }

    // Preis
    val maxPreis = 2200.0
    val minPreis = 0.0
    var autosMitWunschPreis = filterByPreis(minPreis, maxPreis)
    println("Die Autos mit dem gewünschten Preis sind: ")
    println(autosMitWunschPreis)
    autosMitWunschPreis = autoListe.filter { auto -> auto.second in minPreis..maxPreis }

    // Reichweite
    val minReichweite = 6.0
    val autosMitWunschReichweite = filterByReichweite(minReichweite)
    println("Die Autos mit dem gewünschten Reichweite sind: ")
    println(autosMitWunschReichweite)


    val autosMitWunschPreisUndMarke = autoListe.filter{auto ->
        auto.second in minPreis..maxPreis && wunschMarke in auto.first
    }
}

fun filterByMarke(marke: String): List<Triple<String, Double, Double>>{
    val autos = mutableListOf<Triple<String, Double, Double>>()
    
    if (marke in auto1.first){
        autos.add(auto1)
    }
    
    if (marke in auto2.first)
        autos.add(auto2)

    if (marke in auto3.first)
        autos.add(auto3)

    if (marke in auto4.first)
        autos.add(auto4)

    if (marke in auto5.first)
        autos.add(auto5)

    return autos
}

fun filterByModell(modell: String): List<Triple<String, Double, Double>>{
    val autos = mutableListOf<Triple<String, Double, Double>>()

    if (modell == auto1.first){
        autos.add(auto1)
    }

    if (modell == auto2.first)
        autos.add(auto2)

    if (modell == auto3.first)
        autos.add(auto3)

    if (modell == auto4.first)
        autos.add(auto4)

    if (modell == auto5.first)
        autos.add(auto5)

    return autos
}

fun filterByPreis(minLimit: Double = 0.0, maxLimit: Double): List<Triple<String, Double, Double>>{
    val autos = mutableListOf<Triple<String, Double, Double>>()

    if (auto1.second in minLimit..maxLimit){
        autos.add(auto1)
    }

    if (auto2.second <= maxLimit && auto2.second >= minLimit)
        autos.add(auto2)

    if (auto3.second in minLimit..maxLimit)
        autos.add(auto3)

    if (auto4.second in minLimit..maxLimit)
        autos.add(auto4)

    if (auto5.second in minLimit..maxLimit)
        autos.add(auto5)

    return autos
}

fun filterByReichweite(reichweite: Double): List<Triple<String, Double, Double>>{
    val autos = mutableListOf<Triple<String, Double, Double>>()

    if (reichweite <= auto1.third){
        autos.add(auto1)
    }

    if (reichweite <= auto2.third)
        autos.add(auto2)

    if (reichweite <= auto3.third)
        autos.add(auto3)

    if (reichweite <= auto4.third)
        autos.add(auto4)

    if (reichweite <= auto5.third)
        autos.add(auto5)

    return autos
}


// TODO: Challenge
// tip: set Operationen
fun alleFilter(marke: String, preis: Double, reichweite: Double){



}