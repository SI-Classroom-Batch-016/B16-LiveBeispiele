
fun begruessung(name: String){
    println("Hallo $name")
}

fun nameEinlesen(): String{
    println("Geben sie ihren Namen ein:")
    return readln()
}

fun main(){
    var name = nameEinlesen()

    begruessung(name)

}