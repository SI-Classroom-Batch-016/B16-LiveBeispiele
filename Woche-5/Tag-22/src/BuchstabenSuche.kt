
val songText = """
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    Caught in a bad romance
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    Caught in a bad romance
    Rah, rah-ah-ah-ah
    Roma, roma-ma
    Gaga, ooh-la-la
    Want your bad romance
    Rah, rah-ah-ah-ah
    Roma, roma-ma
    Gaga, ooh-la-la
    Want your bad romance
    I want your ugly, I want your disease
    I want your everything as long as it's free
    I want your love
    Love, love, love, I want your love (hey)
    I want your drama, the touch of your hand (hey)
    I want your leather-studded kiss in the sand
    I want your love
    Love, love, love, I want your love (love, love, love)
    (I want your love)
    You know that I want you
    And you know that I need you
    I want it bad, your bad romance
    I want your love, and I want your revenge
    You and me could write a bad romance (oh-oh-oh-oh-oh)
    I want your love and all your lover's revenge
    You and me could write a bad romance
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    Caught in a bad romance
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    Caught in a bad romance
    Rah, rah-ah-ah-ah
    Roma, roma-ma
    Gaga, ooh-la-la
    Want your bad romance
    I want your horror, I want your design
    'Cause you're a criminal as long as you're mine
    I want your love
    Love, love, love, I want your love
    I want your psycho, your vertigo shtick (hey)
    Want you in my rear window, baby, you're sick
    I want your love
    Love, love, love, I want your love (love, love, love)
    (I want your love)
    You know that I want you
    And you know that I need you ('cause I'm a free bitch, baby)
    I want it bad, your bad romance
    I want your love, and I want your revenge
    You and me could write a bad romance (oh-oh-oh-oh-oh)
    I want your love and all your lover's revenge
    You and me could write a bad romance
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    Caught in a bad romance
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    Caught in a bad romance
    Rah, rah-ah-ah-ah
    Roma, roma-ma
    Gaga, ooh-la-la
    Want your bad romance
    Rah, rah-ah-ah-ah
    Roma, roma-ma
    Gaga, ooh-la-la
    Want your bad romance
    Walk, walk, fashion baby
    Work it, move that bitch crazy
    Walk, walk, fashion baby
    Work it, move that bitch crazy
    Walk, walk, fashion baby
    Work it, move that bitch crazy
    Walk, walk, passion baby
    Work it, I'm a free bitch, baby
    I want your love, and I want your revenge
    I want your love, I don't wanna be friends
    J'veux ton amour, et je veux ta revanche
    J'veux ton amour, I don't wanna be friends (oh-oh-oh-oh-oh, oh-oh-oh-oh)
    No, I don't wanna be friends (oh-oh-oh, caught in a bad romance)
    I don't wanna be friends (oh-oh-oh-oh-oh, oh-oh-oh-oh)
    Want your bad romance (oh-oh-oh)
    Caught in a bad romance
    Want your bad romance
    I want your love, and I want your revenge
    You and me could write a bad romance (oh-oh-oh-oh-oh)
    I want your love and all your lover's revenge
    You and me could write a bad romance
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    (Want your bad romance)
    Caught in a bad romance
    (Want your bad romance)
    Oh-oh-oh-oh-oh, oh-oh-oh-oh, oh-oh-oh
    (Want your bad romance)
    Caught in a bad romance
    Rah, rah-ah-ah-ah
    Roma, roma-ma
    Gaga, ooh-la-la
    Want your bad romance
""".trimIndent()


fun main(){

    val suchBuchstabe = 'o'
    var counter = 0

    songText.lowercase()    // für Groß-Kleinschreibung ignorieren

    for (zeichen in songText){
        if (zeichen == suchBuchstabe)
            counter++
    }
    println("'$suchBuchstabe' kommt $counter mal vor")


    println("Der Songtext hat eine Länge von ${songText.length}")
    println(26*2995)
    for (suchBuchstabe in 'a'..'z'){            // 26
        var zaehler = 0

        for (buchstabe in songText.lowercase()){      // 2995
            if (buchstabe == suchBuchstabe)
                zaehler++
        }
        println("Der Buchstabe \"$suchBuchstabe\" kommt $zaehler mal vor.")
    }


    var zaehler: MutableMap<Char, Int > = mutableMapOf()
    for (buchstabe in songText.lowercase()) {      // 2995
        if (buchstabe in zaehler)
            zaehler[buchstabe] = zaehler[buchstabe]!! + 1
        else
            zaehler[buchstabe] = 1
    }
    println(zaehler)


    // Wörter zählen
    // "Hallo ich heiße Gordon".split(" ") -> ["Hallo", "ich", "heiße", "Gordon"]
    var worteImText = songText.split(" ")
    for (wort in worteImText){}


}

/**
 * Zählt die Anzahl des vorkommenden Zeichens [letter] im gegebenen [text].
 *
 * @param text Der Text, in dem das Zeichen gezählt werden soll.
 * @param letter Das Zeichen, das gezählt werden soll.
 * @return Die Anzahl des Vorkommens von [letter] in [text].
 */
fun countLetter(text: String, letter: Char): Int{
    var count: Int = 0

    for (c in text.lowercase()){
        if (c.toString() == letter.lowercase())
            count++
    }

    return count
}