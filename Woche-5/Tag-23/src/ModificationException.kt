
fun main(){

    val tierListe = mutableListOf(
        "Tiger", "Vogel", "Raben", "Krokodil"
    )

    // Problem: Die Liste modifizieren in einer For-In Schleife:
    var gefuetterteTiere = mutableListOf<String>()

//    for (tier in tierListe){
//        println("$tier wird gefüttert")
////        tierListe.remove(tier)          // -> führt zu einer Exception
//        tierListe.add("test")           // -> führt zu einer Exception
//        gefuetterteTiere.add(tier)
//    }
    tierListe.removeAll(gefuetterteTiere)

    // 3 Varianten um über die Indices zu iterieren
    0 .. tierListe.lastIndex    // 0 .. 5      0,1,2,3,4,5
    0 until tierListe.size      // 0 until 5    0,1,2,3,4
    0..< tierListe.size      // 0 until 5-1    0,1,2,3,
    0 ..  tierListe.size - 1
    tierListe.indices



//    var index = 0
    var maxIndex = tierListe.size
//    while (index < maxIndex){
//        val tier = tierListe.removeFirst()
//        println("$tier wurde gefüttert")
//        index++
//    }
//    println(tierListe)


    for (i in 0 until maxIndex){
        val tier = tierListe.removeFirst()
        println("$tier wurde gefüttert")
    }
    println(tierListe)



//    repeat(tierListe.size){
//        tierListe.removeFirst()
//    }
//

/*    for (inx in 0 until tierListe.size){
        val tier = tierListe[inx]
        println("$tier wird gefüttert")
        tierListe.remove(tier)
    }*/

/*    for (inx in tierListe.indices)
    {
        val tier = tierListe[inx]
        println("$tier wird gefüttert")
        tierListe.remove(tier)
    }*/


    /*// Problem Lösung B:
    var iterator = tierListe.iterator()
    for (tier in iterator){
//        iterator.remove()
    }*/

}