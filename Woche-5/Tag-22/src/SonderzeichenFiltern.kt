
fun main(){

    var text = "Hallo, mein Name ist Kotlin!"

    val sonderZeichen = listOf(',', '.', '!', )

    for (zeichen in sonderZeichen){
        text = text.replace(zeichen.toString(), "")
    }
    println(text)


    var eingabe = readln()
    var nurZahlen: Boolean = true

    for (zeichen in eingabe){
        if (!zeichen.isDigit()){
            nurZahlen = false
        }
    }


    listOf("hsdjfhaj", ",", 213, "jhs", "23132").filterIsInstance<Int>()
    listOf("hsdjfhaj", ",", 213, "jhs", "23132").filterIsInstance<String>()


}