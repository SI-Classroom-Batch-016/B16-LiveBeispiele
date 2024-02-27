package bonus

/**
 *  Die heutige Bonusaufgabe simuliert ein Auto-Rennen.
 *  Es sind zwei Autos gegeben.
 *  Die Autos haben gewisse Eigenschaften.
 *
 *  Eure Aufgabe ist, die notwendigen Funktionen zu schreiben,
 *  sodass der Spielfluss in [game] richtig funktioniert.
 */
fun main(){
    game()
}

val car1: MutableMap<String, Int> = mutableMapOf(
    "Fortschritt" to 0,
    "MaxTank" to 50,
    "Tank" to 50,
    "Tempo" to 5,
    "Zeit" to 0
)

val car2: MutableMap<String, Int> = mutableMapOf(
    "Fortschritt" to 0,
    "MaxTank" to 65,
    "Tank" to 65,
    "Tempo" to 3,
    "Zeit" to 0
)



/**
 *  Diese Funktion wiederholt das Spiel so lange, bis ein Auto gewonnen hat.
 *  Dann druckt sie den Gewinner des Rennens aus.
 *
 *  Hier müsst ihr nichts verändern.
 */
fun game(){
    if (raceOver())
        declareWinner()
    else {
        drive(car1)
        drive(car2)
        game()  // Startet die nächste Runde des Spiels
    }
}


/**
 *  TODO:
 *   Diese Funktion soll einen Spielzug für das übergebene Auto simulieren.
 *   Wenn das Auto im Ziel ist, kann das Auto einfach warten.
 *   Wenn das Auto noch nicht im Ziel ist, soll es fahren.
 *      Dabei macht es einen Fortschritt der zufällig zw. 1 und Speed liegt.
 *      Jedes mal, wenn das Auto fährt, soll die Zeit um 1 erhöht werden,
 *      und der Tank um einen zufälligen Wert zwischen 3..7 reduziert werden.
 *   Sollte der Tank weniger als 7 betragen, muss das Auto einen Pitstop ablegen und kann nicht fahren.
 *      Der Pitstop kostet eine Zeit von 3 und füllt den Tank wieder auf das Maximum auf.
 */
fun drive(car: MutableMap<String, Int>){

}

/**
 *  Diese Funktion braucht es nicht zwingend, könnte aber hilfreich sein.
 */
fun pitStop(car: MutableMap<String, Int>){

}

/** TODO:
     Diese Funktion soll ermitteln, ob das Rennen zu Ende ist oder nicht.
     Das Rennen ist zu Ende, wenn beide Fahrer das Ziel erreicht haben (Fortschritt >= 100)
 */
fun raceOver(): Boolean {

    return false // TODO: Hier muss noch der richtige Wert zurückgegeben werden
}

/**
 * TODO:
 *  Diese Funktion soll auf der Konsole ausgeben, welches Auto gewonnen hat.
 *  Sie soll das nur Tun, wenn das Rennen bereits zu Ende ist [raceOver].
 */
fun declareWinner(){

}

