// Gegeben ist eine Variable person,
// die den Namen einer Person enthalten kann.
// Implementiere den folgenden Code so, dass er NULL-Sicherheit gewährleistet.


// Ansatz1
fun main() {
    val person: String? = null

    // Gib den Namen und das Alter der Person aus
    println("Hallo ich heiße ${person ?: "____"}")
}

// Ansatz2
fun main2() {
    println("Geben sie ihren Namen ein:")
    val person: String? = null ?: readln()

    // Gib den Namen und das Alter der Person aus
    println("Hallo, ich heiße ${person}")
}