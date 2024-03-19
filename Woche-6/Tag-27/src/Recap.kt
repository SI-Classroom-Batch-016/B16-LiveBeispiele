
fun main(){

    // Person wird nirgens abgespreichert -> wird direkt wieder gelöscht
    Person()


    // Instanz-Objekte selbst als Konstante veränderbar (ähnlich wie MutableList)
    val dennisF: Person = Person("Dennis F.", 28, gehalt = 3999.99)
//    val dennisF: Person = Person("Dennis F.", 28)
//    dennisF.name = "Dennis F."
//    dennisF.alter = 28
//    dennisF.ehePartner = "Maria F."

//    dennisF.kinder[0]

    dennisF.beschreibung()
    val dennisKatze: Cat = Cat("Fluffy", "rot")

    // Nicht erlaubt: Die Konstante neu belegen
//    dennisF = Person()


    val dennisT = Person("Dennis T.", 42, mutableListOf(Person("Tina", 12, mutableListOf() )))
//    dennisT.name = "Dennis T."
//    dennisT.alter = 42

    println(dennisF)
    println(dennisT)
    println(dennisF == dennisT)
    println(dennisF.name == dennisT.name)


    val sandra = Person("Sandra T.", 8)
    dennisT.kinder.add(sandra)
    dennisT.kinder.add(Person("Matthias T.", 5))

    val mathias = dennisT.kinder[1]
    mathias.alter

//    dennisT.kinder[0].name = "Sandra T."
//    dennisT.kinder[0].alter = 8
//    dennisT.kinder[1].name = "Matthias T."
//    dennisT.kinder[0].alter = 5


}