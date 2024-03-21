package privatePublic

class Konto(
    val inhaber: String,
    private var kontostand: Double,
    private var PIN: String
){

    fun getKontostand(){
        println("geben sie ihren PIN ein:")
        //...
    }



    fun jahreszins(){
        // Am Ende von Jahr 2% zum Kontostand dazu
        kontostand = kontostand * 1.02
        kontostand *= 1.02
    }

    fun geldAbheben(){
        println("Geben sie ihre PIN ein:")
        val eingabe = readln()
        var message: String
        if (eingabe == PIN){
            println("Correct!")
            println("Geben sie ein, wie viel Geld sie abheben möchten:")
            try {
                var betrag = readln().toDouble()

                if (betrag > kontostand){
                    println("Nicht ausreichender Kontostand!")
                    message = "Geld Abheben storniert!"
                } else if (betrag < 0){
                    println("Negativer Betrag eingegeben!")
                    message = "Geld Abheben storniert!"
                } else {
                    kontostand -= betrag
                    message = "Bitte entnehmen sie ihr Geld!"
                }

            } catch (e: Exception){
                println("Ungültige Eingabe!")
                message = "Geld Abheben storniert!"
            }
        }
        else {
            println("Incorrect!")
            message = "Geld Abheben storniert!"
        }

        println(message)
    }

    fun pinAendern(){
        println("Geben sie ihre alte PIN ein:")
        val eingabe = readln()

        if (eingabe == PIN){
            println("Correct!")
            println("Geben sie ihre neue PIN ein:")
            PIN = readln()
        }
        else {
            println("Incorrect!")
            println("PIN Änderung storniert!")
        }
    }
}