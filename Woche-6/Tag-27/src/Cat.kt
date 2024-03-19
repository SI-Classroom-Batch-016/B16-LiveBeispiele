class Cat(
    var name: String,
    var color: String = "black",
)
{
    init {
        println("Meow! Instanz der Klasse Katze namens ${this.name} erstellt.")
    }
}