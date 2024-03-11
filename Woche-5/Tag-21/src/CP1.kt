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