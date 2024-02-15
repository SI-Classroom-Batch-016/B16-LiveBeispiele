

fun main(){

    /*
        Gegeben ist eine Map in der für verschiedene Währungen ein Umrechnungskurs gegeben ist.
        In dieser Map ist immer der Kurs für das Umrechnen von 1€ zu der bestimmten Währung gespeichert.

        Die zweite Map speichert den Preis von verschiedenen Produkten.

        TODO:
            Deine Aufgabe ist es, den Preis von den Produkten umzurechnen in verschiedene Währungen.
            Erstelle eine Map für jede Währung, in der du die Preise der Produkte in anderen Währungen speicherst.

        Ziel der Aufgabe ist es das Erstellen von Maps, und das Abfragen von Werten zu üben.
        Vergiss nicht, dass man beim Abfragen von Werten nullable-Werte erhält.

        TODO:
            Gib auf der Konsole aus, wie viel Dollar die Adidas Schuhe kosten.
            Gib auf der Konsole aus, wie viel Yen die Puma Schuhe kosten
     */

    val wechselKurse: Map<String, Double> = mapOf(
        "Dollar" to 1.08,
        "Yen" to 155.79,
        "Pound Sterling" to 0.86
    )

    val preiseEuro: Map<String, Double> = mapOf(
        "Nike T-Shirt" to 19.99,
        "Adidas Cap" to 12.99,
        "Adidas Schuhe" to 89.99,
        "Puma Schuhe" to 79.99
    )

    val preiseDollar: Map<String, Double> = mapOf(
        // TODO
    )
    val preiseYen: Map<String, Double> = mapOf(
        // TODO
    )
    val preisePound: Map<String, Double> = mapOf(
        // TODO
    )

}