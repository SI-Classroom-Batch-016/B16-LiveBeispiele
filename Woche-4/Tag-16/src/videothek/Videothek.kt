package videothek
import kotlin.random.Random

// Die FilmListe hat alle unsere Filme
var filmListe = mutableListOf<String>(
    "The Dark Knight",  
    "Indiana Jones",  
    "Die Hard",  
    "The Shawshank Redemption",  
    "Schindler's List",  
    "The Godfather",  
    "Star Wars",  
    "The Matrix",
    "The Lord of the Rings",
    "Wayne's World"
)

// Die Preisliste speichert den Preis zu jedem Filmtitel
val filmToPrice = mutableMapOf<String, Double>(
    "The Dark Knight" to Random.nextDouble(2.0, 5.0),
    "Indiana Jones" to randomPrice(5.0, 10.0),
    "Die Hard" to randomPrice(),
    "The Shawshank Redemption" to randomPrice(),
    "Schindler's List" to randomPrice(),
    "The Godfather" to randomPrice(1.0, 2.0),
    "The Matrix" to randomPrice(),
    "The Lord of the Rings" to randomPrice(),
    "Wayne's World" to randomPrice()
)

// Diese Map speichert das Genre zu jedem Filmtitel
val filmToGenre = mutableMapOf(
    "The Dark Knight" to "Action/Adventure",
    "Indiana Jones" to "Action/Adventure",
    "The Shawshank Redemption" to "Drama",
    "Schindler's List" to "Drama",
    "The Godfather" to "Drama",
    "Star Wars" to "Science Fiction/Fantasy",
    "The Matrix" to "Science Fiction/Fantasy",
    "The Lord of the Rings" to "Science Fiction/Fantasy",
    "Wayne's World" to "Comedy"
)

// Diese Map speichert Bewertungen zu jedem Film
val filmRatings = mutableMapOf<String, MutableList<Int>>(
    "The Dark Knight" to generateRatings(),
    "Indiana Jones" to generateRatings(),
    "Die Hard" to generateRatings(),
    "The Shawshank Redemption" to generateRatings(),
    "Schindler's List" to generateRatings(),
    "The Godfather" to generateRatings(),
    "Star Wars" to generateRatings(),
    "The Lord of the Rings" to generateRatings(),
    "Wayne's World" to generateRatings()
)

