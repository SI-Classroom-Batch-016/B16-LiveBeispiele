// Funktionen ohne Rückgabewert nennt man "Void-Funktionen"
fun zufallsZahl() {
    println(
        """
        Geben sie ein, in welchem Bereich die Zahl generiert werden soll:
            Format: min..max
    """.trimIndent()
    )

    val inputs: List<String> = readln().split("..")
    val min = inputs[0].toInt()
    val max = inputs[1].toInt()

    val zufallsZahl = (min..max).random()

    println("Die Zufallszahl ist: $zufallsZahl")
}

// Globale Konstanten werden idR KOMPLETT_GROSS geschrieben
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

fun namensGenerator() {
    val name = VORNAMEN.random() + " " + NACHNAMEN.random()
    println("Zufallsname: '$name'")
}