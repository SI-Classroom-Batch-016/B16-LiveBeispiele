
fun main(){

    /*
        Stelle dir vor, wir programmieren ein kleines Spiel:
        In diesem Spiel können verschiedene Helden gegeneinander kämpfen.

        Die Spieler haben verschiedene Eigenschaften:
           - einen Namen
           - Lebenspunkte
           - Rüstung (verringert den erlittenen Schaden)
           - 2 Waffen (machen einen zufälligen Schaden)
        Manche Eigenschaften sind optional und haben deshalb potenzielle Null-Werte.

        TODO:
            Deine Aufgabe ist es nun 1 Runde eines Kampfes zu berechnen!

        Jeder Spieler darf den anderen Spieler 1 mal angreifen.
        Danach soll angezeigt werden, wie viele Lebenspunkte die Spieler noch haben.

        Der Schaden eines Spielers wird berechnet, in dem man den Schadenswert beider Waffen zusammenrechnet.
        Falls ein Spieler Rüstung hat, wird der erlittene Schaden durch die Rüstung verringert.

        Sollte eine Statistik den Wert null enthalten,
            macht diese Waffe keinen Schaden,
            bzw die Rüstung absorbiert keinen Schaden.
        TIPP: Arbeite dafür mit dem Elvis Operator ?:
     */

    // Spieler 1
    val player1Name: String = "Vanessa die Berserkerin"
    var player1LP: Int = 65
    val player1Armor: Int? = null
    val player1Weapon1: IntRange? = (4..8)
    val player1Weapon2: IntRange? = (4..8)

    // Spieler 2
    val player2Name: String = "Tobi der Ritter"
    var player2LP: Int = 50
    val player2Armor: Int? = 3
    val player2Weapon1: IntRange? = (6..12)
    val player2Weapon2: IntRange? = null


    // TODO 1: Berechne den Schaden den Spieler 1 an Spieler 2 ausrichtet
    println("""
        $player1Name greift $player2Name an.
        Der verursachte Schaden ist: ??
    """.trimIndent()
    )

    // TODO 2: Berechne den Schaden den Spieler 2 an Spieler 1 ausrichtet
    println("""
        $player2Name greift $player1Name an.
        Der verursachte Schaden ist: ??
    """.trimIndent()
    )

    // TODO 3: Zeige korrekt an, wie viel Lebenspunkte die Spieler noch haben

    println("""
        $player1Name: [$player1LP/65]
        $player2Name: [$player2LP/50]
    """.trimIndent()
    )

}