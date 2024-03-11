fun main(){

    repeat(3){
        printHello()
    }

    // Etwas 10-mal wiederholen:    (zB zufälligen Emoji ausdrucken)
    repeat(5){ it ->      // Die Variable it/wdh speichert den Index der aktuellen Wiederholung
        print("Wiederholung ${it + 1} :")
        val zufallsEmoji = listOf("😃", "😅", "😂", "😍","😎", "🥳", "🤪").random()
        println(zufallsEmoji)
    }


    // Den Gegner zufällig 1-5 mal angreifen lassen
    val zufaelligeAnzahl = (1..5).random()
    repeat(zufaelligeAnzahl) {
        println("Attacke")
    }


}

fun printHello(){
    println("Hallo :)")
}