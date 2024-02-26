fun main(){

    println("Regnet es heute?")
    var isRainy: Boolean = jaNeinEingabe()
    println("Regnet es heute: $isRainy")

}

fun jaNeinEingabe(): Boolean{
    println("Geben sie ein: Ja/Nein")
    return when(readln().lowercase()){
        "ja", "j", "yes", "y" -> true
        "nein", "no", "n" -> false
        else -> {
            println("Falsche Eingabe")
            jaNeinEingabe()
        }
    }
}