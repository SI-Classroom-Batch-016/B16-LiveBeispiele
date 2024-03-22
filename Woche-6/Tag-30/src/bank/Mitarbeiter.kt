package bank

/**
 * Eine offene Klasse, die als Basis für verschiedene Arten von Mitarbeitern in einer Bank dient, z. B. Banker, IT-Spezialisten, Berater usw.
 *
 * @property name Der Name des Mitarbeiters, geerbt von der Basisklasse Person.
 * @property geburtsDatum Das Geburtsdatum des Mitarbeiters, geerbt von der Basisklasse Person.
 * @property gehalt Das aktuelle Gehalt des Mitarbeiters, geerbt von der Basisklasse Person.
 * @param startGehalt Das Startgehalt des Mitarbeiters, das zur Initialisierung des Gehalts verwendet wird.
 */
open class Mitarbeiter (
    // Name und Geburtsdatum sind bereits Teil der Basisklasse Person, deswegen kein var/val
    name: String,
    geburtsDatum: String,
    // Das Startgehalt wird genutzt, um das Gehalt zu initialisieren
    startGehalt: Double
): Person(name, geburtsDatum) {

    val interneEmail: String = "${name.replace(" ", ".")}@bank.de"

    // Diese Eigenschaften und Methode sind protected, sodass Kinderklassen diese erben können
    protected var gehalt: Double = startGehalt


    protected fun urlaubAnfragen(){
        //...
    }
}