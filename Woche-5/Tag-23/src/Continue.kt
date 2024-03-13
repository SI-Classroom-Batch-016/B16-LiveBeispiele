// Alkoholische Getränke
var drinks = mutableMapOf<String, Boolean>(
    "Wein" to true,
    "Bier" to true,
    "Saft" to false,
    "Milch" to false,
    "Schnaps" to true,
    "Wasser" to false
)

fun main(){
    // Drucke nur gerade Zahlen aus
    for (i in (1..20)){
        if (i % 2 != 0){
            continue
        }
        println(i)
    }
    
    // Drucke nur alkoholische Getränke aus
    for ((drink, isAlcoholic) in drinks) {
        /*
            20 zeilen code
         */
        if (!isAlcoholic) {
            continue
        }
        println("$drink hat alcohol")
        /*
            200 zeilen code
         */
    }
}