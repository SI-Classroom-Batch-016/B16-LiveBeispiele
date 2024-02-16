
fun main(){

    // "FilmDatenbank"
    var filmDatenbank = mapOf(
        "Inception" to mapOf(
            "Genre" to "Action",
            "Filmjahr" to "2011",
            "Laenge" to "142",
            "Cast" to "Leo, ..."
        ),
        "The Ring" to mapOf(
            "Genre" to "Horror",
            "Cast" to "..."
        )
    )
    filmDatenbank["Inception"]!!["Genre"] ?: "n.a"
    filmDatenbank["Inception"]!!["Laenge"] ?: "n.a"

    val film = "Inception"
    val infos: Map<String, String> = filmDatenbank[film] ?: mapOf()

    println("Film: $film")
    println(infos)

}