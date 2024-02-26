package bonus
import kotlin.random.Random

var name: String = ""

/**
 * Diese Funktion gibt zufällig true/false zurück.
 *
 * @see kotlin.random.Random.nextBoolean
 */
fun zufallsBoolean(): Boolean{
    return Random.nextBoolean()
}

var simHungry: Boolean = zufallsBoolean()
var houseDirty: Boolean = zufallsBoolean()
var simTired: Boolean = zufallsBoolean()
var simLonely: Boolean = zufallsBoolean()

/*
    Die heutige Bonusaufgabe simuliert ein wenig das Videospiel "Sims".
    Man spielt einen Character, welcher verschiedene Bedürfnisse hat:
        Hunger, Sauberkeit, Schlaf und Sozialen Austausch

    Diesen 4 Bedürfnissen, entsprechen die 4 gegebenen globalen Variablen.
    Die Variablen speichern, ob das Bedürfnis erfüllt ist, oder nicht.

    Um die Bedürfnisse zu erfüllen gibt es 4 Methoden:
        eat, sleep, clean, socialize

    TODO:
        Deine Aufgabe ist es eine kleine KI zu programmieren. Die Aufgabe der KI ist es,
            die Bedürfnisse des Sim zu erfüllen.
        Schreibe die Funktion gameAction.
        Abhängig von den Bedürfnissen des Sims, sollte eine passende Aktion gewählt werden.
        Sollten danach alle Bedürfnisse erfüllt sein, kann sich die Funktion beenden (zB mit return).
        Ansonsten soll sich die Funktion selbst neuaufrufen.

    TIP:
        Eventuell ist es hilfreich zuerst die Funktion printCurrentState zu programmieren ;)
 */


fun main(){
    println("Geben sie dem Sim einen Namen:")
    name = readln()

    gameAction()
    println("HURRA, dein Sim ist komplett glücklich")
}


/**
 * TODO:
 *  Diese Funktion sollte den aktuellen Stand der Bedürfnisse des Sims anzeigen
 */
fun printCurrentState(){
    // TODO: Schreibe hier deinen Code
}

fun gameAction(){
    // TODO: schreibe hier deinen Code



    gameAction()
}

fun eat(){
    println("$name hat was gegessen ")
    Thread.sleep(1500)
    simHungry = false

    println("nachdem der Sim gegessen hat, ist die Küche schmutzig")
    houseDirty = true
}

fun clean(){
    println("$name hat geputzt")
    Thread.sleep(3500)
    houseDirty = false

    println("Putzen ist anstrengend, danach ist der Sim müde")
    simTired = true
}

fun sleep(){
    println("$name hat sich schlafen gelegt")
    Thread.sleep(10000)
    simTired = false

    println("nach dem Aufwachen ist der Sim hungrig")
    simHungry = true
}

fun socialize(){
    println("$name hat sich mit Freunden unterhalten")
    Thread.sleep(2500)
    simLonely = false
}
