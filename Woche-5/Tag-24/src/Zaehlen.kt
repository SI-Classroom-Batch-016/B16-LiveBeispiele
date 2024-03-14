

fun main(){

    val kinderGarten = listOf(
        "Tobi",
        "Sandra",
        "Jesus",
        "Mohammed",
        "Jonny",
        "Mohammed",
        "Tobias"
    )


    kinderGarten.count{ name -> name.startsWith("J") }
    kinderGarten.count{ name -> name.length > 5 }

    kinderGarten.count {name -> name == "Tobi"}
    kinderGarten.count {name -> name.contains("Tobi")}


    val altersListe = listOf<Int>(
        6, 9, 2, 18, 22, 5
    )

    altersListe.count{ alter -> alter == 10}
    altersListe.count{ alter -> alter >= 18}
    altersListe.count{ alter -> alter in 5..10}


    val kindergartenV2 = mapOf(
        "Tobi" to 5,
        "Sandra" to 4,
        "Jesus" to 4,
        "Mohammed" to 6,
        "Jonny" to 3,
        "Mohammed" to 5,
        "Tobias" to 4
    )
    kindergartenV2.count()  // kindergartenV2.size

    // Zähle wieviele Kinder min. 6 Jahre alt sind
    kindergartenV2.count {(name, alter) -> alter >= 6}

    // Zähle wieviele Kinder heißen Mohammed
    kindergartenV2.count {it -> it.key == "Mohammed"}


}