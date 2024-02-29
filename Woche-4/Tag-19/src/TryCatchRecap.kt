import kotlin.math.E


fun main(){


    /* try {

     } catch (e: Exception){

     }*/
    val zahlenListe = listOf<Int>()

    try {
        durchschnitt(zahlenListe)
    } catch (e: Exception){
        println("....")
    }

}


fun durchschnitt(list: List<Int>){
    if (list.isEmpty()){
        // throw-Schlüsselwort -> wirft einen Fehler
        throw ArithmeticException("Liste ist leer, geht nicht")
    }
    list.sum() / list.size


}

fun fehlerFunktion(){
    // throw-Schlüsselwort -> wirft einen Fehler

    throw Exception("Test Fehler")
}