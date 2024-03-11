
fun main(){

    var tagListe = listOf(
        "Montag",
        "Dienstag",
        "Freitag",
        "Samstag"
    )

    //--------------------------------
    // Repeat Schleife
    var istFreitagInDerListe: Boolean = false
    repeat(tagListe.size){
        if (tagListe[it] == "Freitag")
            istFreitagInDerListe = true
    }
    println("Ist Freitag in der Liste: $istFreitagInDerListe")

    //--------------------------------
    // While Schleife
    var index = 0
    istFreitagInDerListe = false
    while(index < tagListe.size && !istFreitagInDerListe){
        if (tagListe[index] == "Freitag")
            istFreitagInDerListe = true
        index++
    }

    // Do While Schleife
    index = 0
    do {
        if (tagListe[index] == "Freitag")
            istFreitagInDerListe = true
        index ++
    } while (index < tagListe.size)
    println("Ist Freitag in der Liste: $istFreitagInDerListe")

    // Listenfunktion:
    istFreitagInDerListe = tagListe.contains("Freitag")
    istFreitagInDerListe = "Freitag" in tagListe

}