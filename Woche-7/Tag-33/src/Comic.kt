class Comic(
    autor : String,
    seitenzahl : Int,
    genre : String,
    verlag : String,
    titel : String,
    preis : Double,
    var bilder : String
    ) : Buch(autor, seitenzahl, genre, verlag, titel, preis) {
}