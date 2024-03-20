class Person {
    var vorname = ""
    var nachname = ""
    var alter = 0

    constructor(name: String) {
        this.vorname = name.split(" ")[0]
        this.nachname = name.split(" ")[1]
        println("Ich heiße $vorname $nachname")
    }

    constructor(vn: String, nn: String) {
        this.vorname = vn
        this.nachname = nn
    }

    constructor(name: String, alter: Int) {
        this.vorname = name.split(" ")[0]
        this.nachname = name.split(" ")[1]
        this.alter = alter
    }

    fun geburtstag() {
        println("Alles gute zum Geburtstag!")
        this.alter += 1
    }

}