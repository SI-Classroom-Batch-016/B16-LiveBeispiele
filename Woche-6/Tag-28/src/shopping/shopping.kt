package shopping

fun main(){

    val schuh1 = Schuh("All-Star", 90.00, "Converse", "Schwarz", 42.5)
    val schuh2 = Schuh("Air Force One", 110.00, "Nike", "Weiß", 45.0)
    val schuh3 = Schuh("Jordan 1", 150.00, "Nike", "Rot", 44.0)

    val kunde1 = KundenAccount("kunde1@df.de", "12345")
    val kunde2 = KundenAccount("kunde2@df.de", "1234567")

    val store: Store = Store(sortiment = mutableListOf(schuh1, schuh2, schuh3),
        kunden = mutableListOf(kunde1, kunde2))

    store.produktAbfrage("Jordan 1")

    store.einloggen()
}