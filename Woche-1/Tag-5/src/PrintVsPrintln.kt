
fun main(){
    // println: Druckt aus und fügt eine neue Zeile am Ende der Ausgabe ein
    println("Hallo")
    println("Welt")
    println()   // Druckt eine komplett leere Zeile aus


    // print: Druckt aus
    print("Hallo")
    print("Welt")
//    print() // Nicht möglich ohne Text
    println("-------------")
    print("Geben sie ihr Alter ein: ")
    var alter = readln().toInt()

    println("-------------")
    print("3")
    Thread.sleep(1000)
    print("\b")
    print("2")
    Thread.sleep(1000)
    print("\b")

    print("1")
    Thread.sleep(1000)
    print("\b")
    print("Gooooo!")

    // Print animation:

    println()   // leere Zeile
    println("--------------------")
    println()   // leere Zeile

    Thread.sleep(2000)  // 2 sec warten

    print("Hallo!")
    Thread.sleep(500)   // halbe sec warten
    print(" Na?")
    Thread.sleep(500)
    print(" Schon wach?")
    Thread.sleep(500)


    val pause: Long = 200L
    println()
    print("H")
    Thread.sleep(pause)
    print("a")
    Thread.sleep(pause)
    print("l")
    Thread.sleep(pause)
    print("l")
    Thread.sleep(pause)
    print("o")
    Thread.sleep(pause)

}