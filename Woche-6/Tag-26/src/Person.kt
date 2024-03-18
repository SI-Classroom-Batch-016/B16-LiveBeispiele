
// Klassennamen werden Grossgeschrieben
class Person (
    // Eigenschaften mit Platzhalter
    val name: String,
    var alter: Int = 0
)
{
    // weitere Eigenschaften
    val kinder: MutableList<Person> = mutableListOf()

    // Methode:
    fun vorstellen(){
        println("Hallo ich bin $name")
        println("\t Ich bin $alter Jahre alt.")
        println("\t Ich habe ${kinder.size} Kinder.")

        if (kinder.size > 0){
            for (kind in kinder){
                kind.vorstellen()
            }
        }
    }

}