fun main(){
    simplerCountdown(5)
}


/**
 * Startet einen einfachen Countdown, der die verbleibenden Sekunden ausgibt und dann für jeweils eine Sekunde pausiert,
 * bis der Countdown bei 0 angelangt ist. Nach Erreichen von 0 wird "GO!" ausgegeben.
 *
 * @param sec Die Anzahl der Sekunden im Countdown. Die Funktion wird beendet, wenn `sec` kleiner als 1 ist.
 */
fun simplerCountdown(sec: Int){
    // If-Verzweigung für Abbruch:
    //   Wenn Timer kleiner als 1 ist, wird die Funktion beendet
    if (sec < 1) {
        println("GO!")
        return
    }

    // Druckt aus, wieviele Sekunden noch verbleiben, pausiert dann für 1 sec
    println("$sec..")
    Thread.sleep(999)

    // Ruft den Countdown erneut auf, diesmal mit 1 Sekunde weniger
    simplerCountdown(sec - 1)
}