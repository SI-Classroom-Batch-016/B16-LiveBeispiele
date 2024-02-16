
fun main(){

    // Duplikate in Liste entfernen:
    var testListe = listOf(1, 1, 1, 0, 2, 3, 3)
    testListe = testListe.toSet().toList()
    println(testListe)
    
    val freundeVonMir: List<String> = listOf(
        "Sarah", "Sandra", "Viktoria", "Lukas"
    )
    val freundeVonDir = listOf(
        "Jenny", "Lukas", "Dennis", "Viktoria"
    )
    
    val gemeinsameFreunde = freundeVonMir intersect freundeVonDir
    println(gemeinsameFreunde)

    val alleFreunde = freundeVonDir.union(freundeVonMir)
    println(alleFreunde)
    
    val einzelneFreunde = freundeVonMir subtract freundeVonDir
    println(einzelneFreunde)
    
}