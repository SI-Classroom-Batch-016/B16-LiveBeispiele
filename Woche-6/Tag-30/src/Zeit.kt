import java.time.*

import kotlin.coroutines.*



fun main(){

    val pferd1 = Tier(500)
    val pferd2 = Tier(650)

    pferd1.start()
    pferd2.start()

    while (true){
        println()
    }


}

class Tier(var gewicht: Int): Thread(){

    fun gewichtVerlieren(){
        this.gewicht = (this.gewicht * 0.99).toInt()
        Thread.sleep(5000)
    }

    override fun run() {
        while(true) {
            gewichtVerlieren()
            println("$this: $gewicht KG")
        }
    }

}