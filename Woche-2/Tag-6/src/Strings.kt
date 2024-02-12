val BOXED = "\u001B[51m"

fun main(){


    val text: String = readln().padEnd(10).padStart(15)

    println(text)


    println("$BOXED$text")


}