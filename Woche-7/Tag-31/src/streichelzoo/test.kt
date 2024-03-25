fun main() {
    //Test Besucher
    val besucher1: Besucher = Besucher("Jack Black", 35)
    besucher1.vorstellen()

    //Test Tier
    val tier1: Tier = Tier("Helga", 35.3, 12, "weiblich")
    println(tier1.name)
    println(tier1.gewicht)
    println(tier1.alter)
    println(tier1.geschlecht)
    tier1.bewegung()
    tier1.geraeuscheMachen()
    tier1.streicheln(besucher1)
    tier1.fuettern(besucher1)
    println(tier1.gewicht)

    //Test Schaf
    val schaf: Schaf = Schaf("Shawn", 23.4, 5, "weiblich", true)
    schaf.geraeuscheMachen()

    //Test Kuh
    val kuh: Kuh = Kuh("Berta", 525.0, 7, "weiblich")
    val besucher2: Besucher = Besucher("Franz", 35)
    kuh.melken(besucher2)

    //Test Huhn
    val huhn: Huhn = Huhn("Kikeri", 2.5, 2, "männclich", 2)
    huhn.geraeuscheMachen()
    println(huhn.anzahlEierProTag)

    //Test Pony
    val pony: Pony = Pony("Gustav", 315.0, 3, "Männlich", 30.5)
    val besucher3: Besucher = Besucher("Franz", 35)
    val besucher4: Besucher = Besucher("Sissi", 4)
    pony.reiten(besucher3)
    pony.reiten(besucher4)

    //Test Streichelzoo

    val besucher5: Besucher = Besucher("Sahel", 14)
    val besucher6: Besucher = Besucher("Marek", 60)

    val zoo : Streichelzoo = Streichelzoo()
    zoo.neuerBesucher(besucher1)
    zoo.neuerBesucher(besucher2)
    zoo.neuerBesucher(besucher3)
    zoo.neuerBesucher(besucher4)
    zoo.neuerBesucher(besucher5)
    zoo.neuerBesucher(besucher6)
    zoo.exit(besucher1)
    zoo.exit(besucher6)

    val ponies = zoo.tiere.filterIsInstance<Pony>().shuffled()
    if (ponies.size >= 2)
        zoo.rennen(ponies.first(), ponies.last())

}