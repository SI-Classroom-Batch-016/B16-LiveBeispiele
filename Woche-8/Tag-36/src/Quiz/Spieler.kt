package Quiz

class Spieler (val name: String){

    // TODO: AltersCheck

    var punkte = 0
    val joker: MutableList<Joker> = mutableListOf()


//    var jokerEingesetzt: Int = 0
//    var jokerEingesetzt: Boolean = false

    fun jokerEinsetzen(frage: Frage){

        if (joker.size > 0){
//            val eingesetzerJoker = readln().toInt()
//            joker.remove(eingesetzerJoker)
//            jokerEingesetzt++
//            jokerEingesetzt = true
        }
        else {
            println("$name hat keine Joker übrig.")
        }



    }

}