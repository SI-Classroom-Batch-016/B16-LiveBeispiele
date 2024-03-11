fun main() {

//    aufgabe4()
    aufgabe6()
}


fun aufgabe4(){

    val fruits = listOf(
        "Strawberry",   // index 0
        "Apple",        // index 1
        "Banana",
        "Lemon",
        "Mango",
        "Pineapple"
    )

    println(fruits)

    // Liste via Do-While Schleife ausdrucken
    var index: Int = 0
    do {
        println(fruits[index])
        index ++
//    } while (index < fruits.size)
    } while (index in fruits.indices)

}

fun aufgabe6(){

    val numbers = mutableListOf(3, 6, 4, 7, 42, 1, 26)
//                                (8, 11, 9, 12, 47, 6, 31)

    repeat(numbers.size){
        val alteZahl = numbers[it]
        val neueZahl = alteZahl + 5

        numbers[it] = neueZahl
    }

    // test:
    println(numbers)

}


// Gegeben sind Listen mit Filmtiteln.
//Erstelle eine Funktion, die eine Do-While-Schleife enthält und übergebe nach und nach die Filmlisten
//Die Funktion solle die Liste mit den Lieblingsfilmen durchlaufen und prüfen, ob der Film "Matrix" in der Liste ist.
//Wenn der Film "Matrix" in der Liste ist, soll in der Konsole "Ja, der Film Matrix ist in der Liste." ausgegeben werden.
//Zusätzlich soll die Stelle in der Liste ausgegeben werden, an der sich der Film "Matrix" befindet.
//Du darfst für diese Aufgabe nicht die contains()-Funktion für Listen verwenden.
fun aufgabe5(){
    var filme1: List<String> = listOf(
        "Batman",
        "Frankenstein",
        "Jurassic Park",
        "Grand Budapest Hotel",
        "Harry Potter"
    )
    var filme2: List<String> = listOf(
        "Batman",
        "Frankenstein",
        "Jurassic Park",
        "Matrix",
        "Harry Potter"
    )
    var filme3: List<String> = listOf(
        "Batman",
        "Frankenstein",
        "Jurassic Park",
        "Django",
        "Harry Potter"
    )

    if(matrixInFilmliste(filme1)){
        println("Ja, ...")
        val index = filme1.indexOf("Matrix")
        println(index)
    }
    println(matrixInFilmliste(filme2))
    println(matrixInFilmliste(filme3))
}

fun matrixInFilmliste(filmListe: List<String>): Boolean{
    // siehe EinZiel5Wege.kt
    return true
}