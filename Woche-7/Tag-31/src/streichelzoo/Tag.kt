fun main() {

    val streichelzoo: Streichelzoo = Streichelzoo()
    val besucher1: Besucher = Besucher("Seb", 15)
    val besucher2: Besucher = Besucher("Boris", 4)
    val besucher3: Besucher = Besucher("Timo", 5)
    val besucher4: Besucher = Besucher("Miriam", 18)
    val besucher5: Besucher = Besucher("Sahel", 14)
    val besucher6: Besucher = Besucher("Marek", 60)

    repeat(10000) {
        val zufallsBesucher = Besucher("Zufallsname")
    }

    streichelzoo.neuerBesucher(besucher1)
    streichelzoo.neuerBesucher(besucher2)
    streichelzoo.neuerBesucher(besucher3)
    streichelzoo.neuerBesucher(besucher4)
    streichelzoo.neuerBesucher(besucher5)
    streichelzoo.neuerBesucher(besucher6)

    // Alle Besucher reiten ein Pony
    for (besucher in streichelzoo.besucher) {
        val pony = streichelzoo.tiere.filterIsInstance<Pony>().random()
        pony.reiten(besucher)
    }

    // Problem: Methoden von Unterklassen verwenden
    val schaf: Schaf = streichelzoo.tiere[1] as Schaf
    schaf.bewegung()
    schaf.wolleSauber
    schaf.baden()

    val zufallsTier = streichelzoo.tiere.random()
    when(zufallsTier){
        is Schaf -> (zufallsTier as Schaf).baden()
        is Kuh -> zufallsTier.gibtMilch
    }

    // alternative Lösung: Die Tiere filtern
    val schafe: List<Schaf> = streichelzoo.tiere.filterIsInstance<Schaf>()   // .first() oder .random()
    val schafe2: List<Tier> = streichelzoo.tiere.filter {it is Schaf}    // .first() oder .random()
    schafe2.random() as Schaf

    // Ein Schaf füttern, etc..
    streichelzoo.tiere.filterIsInstance<Schaf>().random().fuettern(besucher3)
    streichelzoo.tiere.filterIsInstance<Huhn>().random().bewegung()

    // 2 zufällige Besucher streicheln 2 zufällige Kühe
    repeat(2) {
        val kuh = streichelzoo.tiere.filterIsInstance<Kuh>().random()
        val besucher = streichelzoo.besucher.random()
        kuh.streicheln(besucher)
    }

    // 2 Leute verlassen den Zoo
    streichelzoo.exit(besucher1)
    streichelzoo.exit(besucher2)


    // 1 zufälliger Besucher melkt eine zufällige Kuh
    streichelzoo.tiere.filterIsInstance<Kuh>().random().melken(streichelzoo.besucher.random())

    // Ein Besucher füttert alle Tiere
    for (tier in streichelzoo.tiere) {
        tier.fuettern(besucher3)
    }

    val schaf1: Schaf = streichelzoo.tiere.filterIsInstance<Schaf>().random()
    if (!schaf1.wolleSauber)
        schaf1.baden()


    val pony1 = streichelzoo.tiere[2] as Pony
    val pony2 = streichelzoo.tiere.filterIsInstance<Pony>().last()
    streichelzoo.rennen(pony1, pony2)

    while (streichelzoo.besucher.isNotEmpty()) {
        streichelzoo.exit(streichelzoo.besucher.first())
    }
}



    