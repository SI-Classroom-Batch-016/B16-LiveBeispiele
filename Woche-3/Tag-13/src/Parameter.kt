fun main() {
    println("Geben sie ihren Namen ein:")
    var profilName = readln()

    homeScreenAnzeigen(profilName)

    var profilAlter = zufallsZahl(bis = 50)
    profilAlter = zufallsZahl(5)
    profilAlter = zufallsZahl(bis = 80, von = 20)
    profilAlter = zufallsZahl(20, 80)

    println("--------")
    steckbrief(profilName, profilAlter)

    println("--------")
    val hotaAlter = zufallsZahl(30, 35)
    steckbrief("Hota", hotaAlter)

    println("--------")
    steckbrief("Gordon", zufallsZahl(25..30))

    println("--------")
    steckbrief("Laura", 42, listOf("Klavier", "Gaming", "Eislauf", "..."))
}

fun homeScreenAnzeigen(name: String) {
    println("Welcome, $name")
}

fun steckbrief(name: String, alter: Int) {
    println("Ich heiße ‘$name’ und bin $alter Jahre alt.")
}

// Selber Name, anderer Parameter: "Overloading"
fun steckbrief(name: String, alter: Int, hobbies: List<String>) {
    println("Ich heiße ‘$name’ und bin $alter Jahre alt.\n Meine Hobbies sind:$hobbies")
}


fun beschreibungGenerieren(name: String, alter: Int): String {
    return "Ich heiße ‘$name’ und bin $alter Jahre alt."
}

fun zufallsZahl(von: Int = 0, bis: Int = 10): Int {
    return (von..bis).random()
}

fun zufallsZahl(vonBis: IntRange): Int {
    return vonBis.random()
}