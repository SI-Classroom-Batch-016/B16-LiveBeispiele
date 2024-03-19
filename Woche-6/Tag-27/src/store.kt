
fun main(){

    val sortiment = mutableListOf<Produkt>()

    sortiment.add(Produkt("Mars", 1.99))
    sortiment.add(Produkt("Milky Way"))
    sortiment.add(Produkt("Snickers", 1.99, 6))
//    sortiment.add(Produkt())

    var mars = sortiment[0]
    mars.preis = 2.5


    for (artikel in sortiment){
        println("${artikel.artikelName} kostet ${artikel.preis}€")
    }


}