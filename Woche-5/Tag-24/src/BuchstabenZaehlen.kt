fun buchstabeInTextZaehlen(text: String, buchstabe:Char): Int{

    // macht das selbe wie: text.count {it == buchstabe}

    var count = 0
    for (it in text.lowercase()){
        if (it == buchstabe)
            count++
    }
    return count
}


fun main() {

    val text:String  = """
        Every night, I live and die
        Feel the party to my bones
        Watch the wasters blow the speakers
        Spill my guts beneath the outdoor light
        It's just another graceless night
        I hate the headlines and the weather
        I'm nineteen and I'm on fire
        But when we're dancing, I'm alright
        It's just another graceless night

        Are you lost enough?
        Have another drink, get lost in us
        This is how we get notorious, oh
        'Cause I don't know
        If they keep tellin' me where to go
        I'll blow my brains out to the radio, oh-oh-oh (Tch-tch)

        All of the things we're taking
        'Cause we are young and we're ashamed
        Send us to perfect places
        All of our heroes fading
        Now I can't stand to be alone
        Let's go to perfect places

    """.trimIndent()

    // Variante 1: Der Reihe nach alle Buchstaben zählen
    for (char in 'a' .. 'z'){
        val anzahl = buchstabeInTextZaehlen(text.lowercase(), char)
        //text.lowercase().count{it == char}
        println("'$char' kommt $anzahl oft vor.")
    }

    // Variante 2: In einem Durchlauf alle buchstaben zählen
    val zaehler: MutableMap<Char, Int> = mutableMapOf()
    for (char in 'a'..'z')
        zaehler[char] = 0   // Zähler initialisieren
    for (zeichen in text.lowercase()){                // text.lowercase().forEach { ->
        if (zeichen in 'a'..'z'){                //   if (zeichen in zaehler.keys){
        zaehler[zeichen] = zaehler[zeichen]!! + 1
        }
    }
    // Den Zähler noch ausdrucken:
    println(zaehler)

    /*
   zaehler.keys.sorted().forEach{
       println("$it kommt ${zaehler[it]} mal vor.")
   }*/






















    // Geschachtelte For-Schleife in der wir zuerst über alle Buchstaben in der "Range" a-z iterieren, um anschließend
    // über jedes Zeichen im gegeben Text zu iterieren und zu prüfen, ob aktuelle Zeichen dem aktuellen Buchstaben entspricht
    var counter = 0
    for (buchstabe in 'a'..'z') {
        var anzahl = 0
        for (zeichen in text.lowercase()) {
            if (zeichen == buchstabe) {
                anzahl++
                counter++
            }
        }
        println("$buchstabe: $anzahl")
        counter += anzahl
    }

    println("a-z insgesamt: $counter")

    // Gleiches Ergebnis beim Verwenden einer Map, die neu gefundene Zeichen automatisch in der Map anlegt
    // Findet auch alle Zeichen und nicht nur die Buchstaben a-z
    val map: MutableMap<Char, Int> = mutableMapOf()
    for (zeichen in text.lowercase()) {

        if (map.keys.contains(zeichen)) {
            map[zeichen] = map[zeichen]!!.plus(1)
        } else {
            map[zeichen] = 1
        }

    }

    // Einen Satz in einzelne Wörter aufteilen
    // splittedString enthält am Ende eine Liste mit allen Wörtern
    val splittedString = text.split(" ")

}