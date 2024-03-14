fun main() {

    val options = listOf("Schere", "Stein", "Papier")

    var pointsPlayer = 0
    var pointsPC = 0

    var handPlayer: String
    var handPC: String

    while (pointsPC < 3 && pointsPlayer < 3) {

        handPC = options.random()
        handPlayer = handAuswahl(options)

        // Handvergleich
        if (handPC == handPlayer) {
            println("Unentschieden!")
        }
        // Fälle in denen Spieler gewinnt
        else if (handPC == "Schere" && handPlayer == "Stein") {
            println("Stein schlägt Schere")
            println("Punkt für den Spieler!")
            pointsPlayer++
        }
        else if (handPC == "Papier" && handPlayer == "Schere") {
            println("Schere schlägt Papier")
            println("Punkt für den Spieler!")
            pointsPlayer++
        }
        else if (handPC == "Stein" && handPlayer == "Papier") {
            println("Papier schlägt Stein")
            println("Punkt für den Spieler!")
            pointsPlayer++
        }

        // Fälle in denen PC gewinnt
        else if (handPC == "Stein" && handPlayer == "Schere") {
            println("Stein schlägt Schere")
            println("Punkt für den PC!")
            pointsPC++
        }
        else if (handPC == "Schere" && handPlayer == "Papier") {
            println("Schere schlägt Papier")
            println("Punkt für den PC!")
            pointsPC++
        }
        else if (handPC == "Papier" && handPlayer == "Stein") {
            println("Papier schlägt Stein")
            println("Punkt für den PC!")
            pointsPC++
        }
    }

    if (pointsPlayer > pointsPC)
        println("Gratuliere, du hast gewonnen!")
    else
        println("Schade, der PC hat gewonnen")
}

fun handAuswahl(options: List<String>): String {
    println("\nWählen sie ihre Hand aus:")
    for (i in options.indices) {
        println("${i + 1} für ${options[i]}")
    }
    try {
        val input = readln().toInt() - 1
        return options[input]
    } catch (ex: Exception) {
        println("Ungültige Auswahl!")
        return handAuswahl(options)
    }

}
