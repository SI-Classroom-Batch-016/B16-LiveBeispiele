fun main() {

    // Funktionsaufruf gibt uns den Rückgabewert
    val name1: String = getRandomName()
    val name2 = getRandomName()

    println("Name 1: $name1")
    println("Name 2: $name2")

    // Ohne Variable get das Ergebnis verloren
    getRandomName()
    println(getRandomName())

    // Automatisches Entpacken von einem Pair
    val (name3, name4) = getTwoNames()
    println("Name 3: $name3")
    println("Name 4: $name4")

    val ehePaar = getTwoNames()


}

fun getRandomNumber(): Int {
    println("In welchem Bereich soll eine Zufallszahl generiert werden?")
    val von: Int = readln().toInt()
    val bis: Int = readln().toInt()
    return (von..bis).random()
}

val VORNAMEN = listOf(
    "Johannes",
    "Michael",
    "Thomas",
    "Andreas",
    "Daniel",
    "Stefan",
    "Markus",
    "Alexander",
    "Christian",
    "Martin",
    "Anna",
    "Maria",
    "Lisa",
    "Sarah",
    "Julia",
    "Christina",
    "Laura",
    "Jessica",
    "Melanie",
    "Sandra"
)
val NACHNAMEN = listOf(
    "Müller",
    "Schmidt",
    "Schneider",
    "Fischer",
    "Weber",
    "Wagner",
    "Becker",
    "Hoffmann",
    "Schäfer",
    "Koch",
    "Bauer",
    "Richter",
    "Klein",
    "Wolf",
    "Schröder",
    "Neumann",
    "Schwarz",
    "Braun",
    "Zimmermann",
    "Krüger"
)

fun getRandomName(): String {
    return VORNAMEN.random() + " " + NACHNAMEN.random()
}

fun getTwoNames(): Pair<String, String> {
    return getRandomName() to getRandomName()
}

fun getTenNames(): List<String> {
    return listOf(
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
        getRandomName(),
    )
}
