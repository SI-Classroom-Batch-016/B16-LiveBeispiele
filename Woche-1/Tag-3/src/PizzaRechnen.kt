fun main() {
    /*
        Ziel:
          auf Konsole einlesen:
            - wie viele Freunde kommen
            - wie viele Stücke pro Person

        ausrechnen:
            - wie viele Pizzen muss ich kaufen?
     */

    //Auf Konsole einlesen: Wie viele Freunde kommen?
    println("Wie viele Freunde kommen?")
    var freunde: Int = readln().toInt()
    println("Es kommen $freunde Freunde.")

    //Auf Konsole einlesen: Wie viele Stücke pro Person?
    println("Wie viel Stücke pro Person?")
    var stuecke: Int = readln().toInt()
    println("Jede Person isst $stuecke Stücke.")

    //Ausrechnen: Wie viele Pizzen muss ich kaufen?
    val stueckeProPizza: Int = 6
    var pizzaZahl: Int = stuecke * freunde / stueckeProPizza
    println("Wir brauchen $pizzaZahl Pizzen.")


    var restStuecke: Int = (pizzaZahl * stueckeProPizza) % (stuecke)
    println("Es bleiben dann $restStuecke Stücke übrig.")
}


/*
println("Geben sie ein, wieviele FreundInnen zur Party kommen:")
    var input = readln()        // das Ergebnis von readln ist immer ein String
    var anzahlFreunde: Int = input.toInt()

    println("Geben sie ein, wieviele Pizzen bestellt wurden:")
    var anzahlPizzen: Int = readln().toInt()

    var anzahlStuecke = anzahlPizzen * 6
    var anzahlStueckeProPerson = anzahlStuecke / anzahlFreunde
    var restStuecke = anzahlStuecke % anzahlFreunde

    println("Jede Person bekommt $anzahlStueckeProPerson Stücke ")
    println("Es bleiben $restStuecke Stücke übrig")

 */