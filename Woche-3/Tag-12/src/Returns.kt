import kotlin.random.Random

fun main() {

    val zahl = getRandomNumber()
    println("Die Zufällige Zahl ist: $zahl")


    var a = calculateSum()
    println(calculateSum())
    a = a * 2
    println(a)

    // Bei einem Pair als Rückgabewert, kann man die 2 Ergebnisse auch in unterschiedliche Variablen speichern
    var (sum, diff) = calculateSumAndDiff()


    var spieler1 = namensGeneratorReturn()
    var spieler2 = namensGeneratorReturn()
    println("$spieler1 spielt gegen $spieler2")

    var fussballTeam = listOf(
        // 11 mal
        namensGeneratorReturn(),
        namensGeneratorReturn(),
        namensGeneratorReturn(),
        // ...
    )

}


fun getRandomBoolean(): Boolean {
    return listOf(true, true, true, false, false).random()
}

fun wuerfel(): Int {
    return (1..6).random()
}

fun calculateSum(): Double {
    var ergebnis: Int = zufallsZahlReturn() + zufallsZahlReturn()
    println("10 + 3 = $ergebnis")
    return ergebnis.toDouble()
}

fun calculateDiff(): Double {
    var diff: Int = zufallsZahlReturn() - zufallsZahlReturn()
    println("10 - 3 = $diff")
    return diff.toDouble()
}

fun calculateSumAndDiff(): Pair<Double, Double> {
    var sum: Double = 10.0 + 3
//    println("10 + 3 = $sum")

    var diff: Double = 10.0 - 3
    return Pair(sum, diff)
}

fun namensGeneratorReturn(): String {
    var name = VORNAMEN.random() + " " + NACHNAMEN.random()
    return name
}

fun zufallsZahlReturn(): Int {
    println(
        """
        Geben sie ein, in welchem Bereich die Zahl generiert werden soll:
            (Format: min..max)
    """.trimIndent()
    )

    val inputs = readln().split("..")
    val min = inputs[0].toInt()
    val max = inputs[1].toInt()

    val zufallsZahl = (min..max).random()

    return zufallsZahl
}

fun zufallsKommaZahl(): Double {
    println(
        """
        Geben sie ein, in welchem Bereich die Zahl generiert werden soll:
            (Format: min..max)
    """.trimIndent()
    )

//    val inputs = readln().split("..")
    val min = readln().toInt() // inputs[0].toInt()
    val max = readln().toInt() // inputs[1].toInt()

    var zahl: Double = (min..max - 1).random().toDouble() + Random.nextDouble()
    return zahl
}

fun getRandomNumber(): Int {
    println(
        """
        Geben sie ein, in welchem Bereich die Zahl generiert werden soll:
            Format: min..max
    """.trimIndent()
    )

    val inputs = readln().split("..")
    val min = inputs[0].toInt()
    val max = inputs[1].toInt()

    val zufallsZahl = (min..max).random()
    return zufallsZahl
    // TODO: Unreachable Code
    println("Die Zufallszahl ist: $zufallsZahl")
}

fun getTwoRandomNumbers(): Pair<Int, Int> {
    val numbers: Pair<Int, Int> = getRandomNumber() to getRandomNumber()
    return numbers
}

fun getRandomName(): String {
    return VORNAMEN.random() + " " + NACHNAMEN.random()
}

fun getAge(): Int {
    var currentYear: Int = 2024
    var birthYear: Int = zufallsZahlReturn()

    var age: Int = currentYear - birthYear

    return age
}

fun getRandomFussballTeam(): List<String> {
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

fun kampf(): Boolean {
    return false
}

fun getRandomAttack(): Pair<String, IntRange> {
    val attacken = mapOf(
        "Tackle" to 40..50,
        "Feuersturm" to 120..140,
        "BodyCheck" to 80..80,
        "Hitzewelle" to 90..110
    )

    val randomAtk: String = attacken.keys.random()
    val randomDmg: Int = attacken[randomAtk]!!.random()

//    return randomAtk to randomDmg
    return attacken.entries.random().toPair()
}
