package Kartenspiel

fun main(){
    var karoAss = Karte("Karo", "Ass")
    var pik10 = Karte("Pik", "10")

    var blablabla = Karte("Karo", "Ass")
    var herzDame = Karte("dfsjiahsdfkj", "hjdsfhjasd")

    println(karoAss)
    println("${karoAss.suit} ${karoAss.wert}")
    println(karoAss.printKarte())
    karoAss.umdrehen()
    println(karoAss.printKarte())
    println(pik10)


    // Sind die 2 Karo Ass karten gleich?
    println("Sind die beiden Karo Asse gleich? ${karoAss == blablabla}")


    var deck = Deck()
    deck.reset()
    deck.mischen()

    var gezogeneKarte: Karte = deck.karteZiehen()

    println("Verbleibende Karten: ${deck.kartenStapel.size}")



    var marianne = Spieler("Marianne")
    var gordon = Spieler("Gordon", 1000.00)

    marianne.karteZiehen(deck)
    marianne.karteZiehen(deck)
    gordon.karteZiehen(deck)
    gordon.karteZiehen(deck)




}


fun rundeBlackjack(spielerListe: List<Spieler>){
    var dealer = Spieler("Dealer", 10000000.00)

    var deck = Deck()
    deck.reset()
    deck.mischen()

    repeat(2){
        dealer.karteZiehen(deck)

        for (spieler in spielerListe)
            spieler.karteZiehen(deck)
    }

    /* TODO...
        - spieler müssen Geld bieten
        - spieler dürfen Karten ziehen
        - dealer muss ggf. Karten ziehen
        - evtl extra Regeln mit Split und Ass
        - Punkte berechnen
        - Gewinn berechnen
     */

}