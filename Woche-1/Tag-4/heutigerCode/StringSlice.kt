
fun main(){


    var beispiel: String = "passwort123456#12351234"
    // slice erlaubt uns den String auszuschneiden

    // von .. bis
    var ausschnitt: String = beispiel.slice(0..14)
    println(ausschnitt)


    ausschnitt = beispiel.substring(5, 10)
    println(ausschnitt)



}