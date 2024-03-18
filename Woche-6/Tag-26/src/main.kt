
fun main(){
    val hota = Person("Hota")
    val gordon = Person("Gordon")

    val hsdjhafsjhsdg = Person("Sasha")

    val fabian = Person("Fabian")
    fabian.vorstellen()

    println("$fabian")

    println("------")


    val kevin = Person("Kevin M.", 9)

    kevin.alter ++

    kevin.vorstellen()

    val maria = Person("Maria Z.", 42)
    val maria2 = Person("Maria F.", 86)

    val jonny = Person("Jonny Spells", 21)

    maria.kinder.add(jonny)


    println("------")
    println("${fabian.name}")
    println("$maria")
    println("$kevin")

    println("------")

/*
    val dennis = Person()
    dennis.name = "Dennis S."
    dennis.alter = 47
    dennis.biologischesGeschlecht = 'm'

    dennis.kinder.add(Person())
    dennis.kinder[0].name = "Rebekka"
    dennis.kinder[0].alter = 23
    dennis.kinder[0].biologischesGeschlecht = 'w'

    val rebekka = dennis.kinder[0]
    rebekka.geburtstag()

    println(dennis)
    dennis.beschreibung()

    val thomas: Person = Person()
    thomas.name = "Thomas"
    thomas.alter = 5

    rebekka.kinder.add(thomas)

    // Dennis Enkelkinder:
    dennis.kinder[0].kinder


    var eheMap: Map<Person, Person>*/


}


fun nameEingeben(): String{
    println("Geben sie ihren Namen ein")
    return readln()
}