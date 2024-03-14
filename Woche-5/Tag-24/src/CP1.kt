fun main(){

    val einkaufsliste = listOf(
        "Schokolade", "Eier", "Käse"
    )

    print("[")
    for (artikel in einkaufsliste){
        if (artikel.contains("e"))
            print("$artikel , ")        // für jeden Artikel -> 1 println
    }
    println("]")

    println(einkaufsliste)


    val gradesMap = mapOf(
        "Kevin" to 2.3,
        "Chantal" to 3.3,
        "Jeremy" to 2.5,
        "Olivia" to 2.6,
        "Murat" to 1.9,
        "David" to 2.2,
        "Lisa" to 3.1,
        "Phil" to 2.9,
        "Florian" to 2.6,
        "Onur" to 2.3,
        "Joachim" to 3.7
    )


//    gradesMap.entries.sortedBy { (name, note) -> ... }
}