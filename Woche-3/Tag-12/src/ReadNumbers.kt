
fun main(){
    
}

fun readInt(): Int{
    println("Geben sie eine Zahl ein:")
    val zahl: Int? = readln().toIntOrNull()
    
    if (zahl == null)
        return readInt()
    else
        return zahl
}

fun readDouble(): Double{
    println("Geben sie eine Kommazahl ein:")
    val zahl: Double? = readln().toDoubleOrNull()

    if (zahl == null)
        return readDouble()
    else
        return zahl
}