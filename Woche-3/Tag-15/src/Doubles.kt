

fun randomZahl(): Double{
    return (200..500).random() * 0.01
//    return "%.2f".format((200..500).random() * 0.01).replace(",", ".").toDouble()
}

fun main(){

    println(332 * 0.01) // 3.32


    repeat(100){
        println(randomZahl())
    }

    println(13.42-5.0)
}