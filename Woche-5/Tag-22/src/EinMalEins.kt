fun main() {

    // Zwei verschachtelte For Schleifen, die das kleine 1x1 berechnen
    // Beide Schleifen zählen von 1 bis 10 und speichern den jeweiligen Wert in den Variablen i und j
    // Für jede Iteration der äußeren Schleife wird die innere Schleife 10 Mal ausgeführt
    // Insgesamt wird der print-Befehl in Zeile 11 also 100 mal ausgeführt

    for (i in 1..10) {
        for (j in 1..10) {
            print(" ${i*j}")
        }
        println()
    }

    for (buchstabe in 'a'..'z'){
        print(buchstabe)
    }
    println()
    for (buchstabe in 'z' downTo 'a')
        print(buchstabe)

}