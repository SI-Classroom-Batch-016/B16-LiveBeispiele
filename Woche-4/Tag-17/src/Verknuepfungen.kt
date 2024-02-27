
fun main(){
    wetterBeispiele()
    autoSucheFilter()
}

fun wetterBeispiele(){
    val isSunny: Boolean = getRandomBoolean()
    val isRaining: Boolean = getRandomBoolean()
    val isWindy: Boolean = getRandomBoolean()
    val isDay: Boolean = getRandomBoolean()
    val temperature = getRandomTemperature() //zw. -5 und 30 Grad Celsius

    // TODO: NOT !
    // Cloudy
    val isCloudy: Boolean = !isSunny

    // Night
    val isNight = !isDay

    // Warm Outside
    val isWarm = temperature > 20  // !(temperature < 20)
    val isCold = !isWarm


    // TODO: AND &&

    // Rainbow
    if (isRaining && isSunny)
        println("Wir sehen heute einen Regenbogen 🌈")

    if (isRaining){
        if (isSunny){
            println("Wir sehen heute einen Regenbogen 🌈")
        }
    }

    // Snow
    val isSnowing: Boolean = isRaining && (temperature < 4)
    if (isSnowing)
        println("Es schneit")

    // Sunscreen
    if (isSunny && isWarm){
        println("Heute sollte ich viel Wasser trinken")
    }

    // TODO: OR ||
    // | = "Pipe" = Option + 7
    // Jacket
    if (isWindy || isRaining || isCold)
        println("Heute sollte ich eine Jacke anziehen")

    // Und & Oder im selben Satz
    if (isCold || (isCloudy && (isWindy || isRaining))){
        println("Heute sollte ich eine Jacke anziehen")
    }
}


fun autoSucheFilter(){

    // Verschiedene Eigenschaften für Autos:
    var price = (1500..5500).random()
    var ps = (100..150).random()
    var anzahlSitze = (2..5).random()
    var farbe: String = listOf("Silber", "Grün", "Blau").random()


    // Ein Auto finden, dass NICHT weniger als 3 Sitze hat
    var nichtWenigerAls3Sitze: Boolean = !(anzahlSitze < 3)
    nichtWenigerAls3Sitze              = anzahlSitze >= 3
    nichtWenigerAls3Sitze              = !(anzahlSitze <= 2)
    nichtWenigerAls3Sitze              = anzahlSitze > 2

    // farbe soll nicht grün sein
    var nichtGrueneAutos: Boolean =  (farbe != "Grün")

    // Auto entweder silber, grau oder blau
    var entwederSilberOderBlau: Boolean = farbe == "Blau" || farbe == "Silber" || farbe == "Grau"

    // preis niedriger als 2000
    var preisNiedrig: Boolean = price < 2000.0

    // mindestens 100 ps
    var mindestensPS: Boolean = ps >= 100

    // Auto finden, bei dem 3 Bedingungen wahr sind
    var alleDrei: Boolean = preisNiedrig && mindestensPS && nichtGrueneAutos

}