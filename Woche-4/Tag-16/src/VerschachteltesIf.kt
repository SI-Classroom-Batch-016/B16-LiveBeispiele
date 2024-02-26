

fun main(){

    // 2 Eingaben:
    println("Regnet es?")
    var regnetEs: Boolean = readln().contains("ja")

    println("Gehst du heute raus?")
//    var rausgehen: Boolean = readln().contains("ja")

    var rausgehen: Boolean  = when (readln()){
        "ja", "yes", "j", "y", "JA", "ok", "OK","👍🏻" -> true
        else -> false
    }

//    Wenn der Nutzer rausgeht und es regnet, soll ihm empfohlen werden einen Regenschirm mitzunehmen.
    if (rausgehen){
        if (regnetEs){
            println("Regenschirm mitnehmen")
        }
//    Wenn der Nutzer rausgeht und es nicht regnet, soll ihm empfohlen werden einen Sonnenschirm mitzunehmen
        else {
            println("Sonnenschirm mitnehmen")
        }
    }
    if (rausgehen){
        if (!regnetEs){     // ! heißt "nicht"
            println("Sonnenschirm mitnehmen")
        }
    }
//    Wenn der Nutzer nicht rausgeht und es regnet, soll ihm empfohlen werden die Fenster zu schließen
//    Wenn der Nutzer nicht rausgeht und es nicht regnet, brauch ihm nichts empfohlen werden.
}