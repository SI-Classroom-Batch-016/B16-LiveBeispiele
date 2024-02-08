
fun main(){

    var passwort = "abcghasfgdg"

    // Passwort auf 5 Zeichen verlängern
    passwort = passwort.padEnd(5, '.')
    println(passwort)

    // Passwort auf max. 5 Zeichen kürzen
    passwort = passwort.substring(0, 5)
    println(passwort)


}