import kotlin.math.round

fun main(){
    println("test".erstesZeichenGross())
    println("TEST".erstesZeichenGross())
    println("test test".erstesZeichenGross())
    println("7357".erstesZeichenGross())
//    println("".erstesZeichenGross())  // Exception

    println("----------------")
    println("55.5598172367 € ---> ${55.5598172367.geldBetrag("€")}")
    println("----------------")
    println("Geben sie eine Kommazahl ein zum Runden:")
    val testZahl: Double = readln().toDouble()
    println("$testZahl gerundet ist: ${testZahl.gerundet()}")
    println("7.34 gerundet ist: ${7.34.gerundet()}")
    println("8.76 gerundet ist: ${8.76.gerundet()}")
    println("0.49 gerundet ist: ${0.49.gerundet()}")
    println("0.50 gerundet ist: ${0.50.gerundet()}")
    println("0.51 gerundet ist: ${0.51.gerundet()}")
    println("1.50 gerundet ist: ${1.5.gerundet()}")
    println("2.50 gerundet ist: ${2.5.gerundet()}")


    println("----------------")
    println("Ist 5 gerade? ${5.geradeZahl()}")
    println("Ist 8 gerade? ${8.geradeZahl()}")
    println("Ist 11 ungerade? ${11.ungeradeZahl()}")

    println("----------------")
    println("Ist 5 eine Primzahl? ${5.primZahl()}")
    println("Ist 8 eine Primzahl? ${8.geradeZahl()}")
    println("Ist 1234567 eine Primzahl? ${1234567.ungeradeZahl()}")
}


/**
 * Erzeugt einen neuen String, in der das erste Zeichen des Ursprungsstrings in Großbuchstaben umgewandelt wird.
 *
 * @return Der String mit dem ersten Zeichen als Großbuchstaben.
 *
 * @throws NoSuchElementException wenn der Ursprungsstring leer ist.
 */
fun String.erstesZeichenGross(): String {
    return this.first().uppercase() + this.substring(1)
}

/**
 * Rundet die Gleitkommazahl auf die nächstgelegene ganze Zahl.
 *
 * @return Die gerundete ganze Zahl.
 */
fun Double.gerundet(): Int{
    return round(this).toInt()
}

/**
 * Formatiert den Double-Wert als Geldbetrag und gibt den resultierenden Betrag als String zurück.
 *
 * Diese Funktion nimmt einen Double-Wert entgegen und formatiert ihn als Geldbetrag, indem der
 * Wert auf zwei Dezimalstellen gerundet wird. Der formatierte Geldbetrag wird dann mit der
 * angegebenen Einheit (z.B., "$" für US-Dollar) kombiniert und als String zurückgegeben.
 *
 * @param einheit Die Einheit, die dem Geldbetrag hinzugefügt werden soll (z.B., "$").
 * @return Der formatierte Geldbetrag als String.
 */
fun Double.geldBetrag(einheit: String): String{
    return "%.2f$einheit".format(this)
}


/**
 * Überprüft, ob die gegebene ganze Zahl gerade (durch 2 teilbar) ist.
 *
 * @return `true`, wenn die Zahl gerade ist, ansonsten `false`.
 */
fun Int.geradeZahl(): Boolean{
    return this % 2 == 0
}

/**
 * Überprüft, ob die gegebene ganze Zahl ungerade (nicht durch 2 teilbar) ist.
 *
 * @return `true`, wenn die Zahl ungerade ist, ansonsten `false`.
 */
fun Int.ungeradeZahl(): Boolean{
    return this % 2 == 1
}

/**
 * Überprüft, ob die aktuelle ganze Zahl eine Primzahl ist.
 *
 * Eine Primzahl ist eine natürliche Zahl größer als 1, die nur durch 1 und sich selbst ohne Rest teilbar ist.
 *
 * @throws IllegalArgumentException Wenn die Zahl kleiner als 2 ist, da Primzahlen nur für Zahlen größer als 1 definiert sind.
 *
 * @return `true`, wenn die Zahl eine Primzahl ist, andernfalls `false`.
 */
fun Int.primZahl(): Boolean{
    if (this < 2)
        throw IllegalArgumentException("Die Zahl $this kann nicht auf Primzahl überprüft werden.")

    if (this == 2)
        return true

    for (i in 2..<this){
        if (this % i == 0){
            return false
        }
    }

    return true
}