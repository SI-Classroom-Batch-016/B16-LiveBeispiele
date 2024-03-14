val bestand: MutableMap<String, Boolean> = mutableMapOf(
    "Apfel" to true,
    "Mango" to false,
    "Ananas" to true,
    "Banane" to false,
    "Kirsche" to false,
    "Erdbeere" to true,
    "Zitrone" to true
)


fun main() {
    // für jede Zutat:
    for ((zutat, istAufLager) in bestand) {
        //  ist die Zutat nicht auf Lager?
        if (!istAufLager) {
            // dann nachbestellen
            nachbestellen(zutat)
        }
    }
}

fun nachbestellen(zutat: String){
    // TODO:
    println("$zutat wurde nachbestellt")
    bestand[zutat] = true
}