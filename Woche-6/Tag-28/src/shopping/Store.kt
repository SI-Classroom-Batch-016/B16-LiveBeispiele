package shopping


class Store(var sortiment: MutableList<Schuh>,
            var kunden: MutableList<KundenAccount>) {

    fun produktAbfrage(name: String) {
        val results = sortiment.filter { it.name == name }

        println(results.forEach { it.preis })
    }

    fun schuheFiltern(preis: Double) {
        val results = sortiment.filter { it.preis <= preis}
        print(results.forEach { it.name })
    }

    fun einloggen() {
        println("Gib deine Email ein")
        val email = readln()

        println("Gib dein Passwort ein")
        val passwort = readln()

        // Prüft ob Eingaben mit Logindaten vom Kunden übereinstimmen
        if (kunden.filter { it.email == email && it.passwort == passwort }.isEmpty()) {
            println("Falsche Eingaben")
        } else {
            println("Du bist eingeloggt!!!")
        }
    }
}