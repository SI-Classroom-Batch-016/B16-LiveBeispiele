
fun main(){
    println(returnNumber(true))
    println(returnNumber(true))
    println(returnNumber(false))
    println(returnNumber(false))
}


fun returnNumber(negative: Boolean): Int{
    if (negative) {
        return (-10..-1).random()
    }
    else {
        return (1..10).random()
    }
}


fun passwortCheck(): Boolean{

    return listOf(true, false).random()
}

fun login(){

    if (passwortCheck()){
        println("Willkommen User")
    }
    else
    {
        login()
    }


}