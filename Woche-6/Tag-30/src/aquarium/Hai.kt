package aquarium

class Hai(name: String): Fisch(name) {

    override fun essen(){
        println("${this.toString()}: Ich esse nur andere Fische")
        Thread.sleep(SLEEP_TIME)
    }

    // $this == $this.toString()
    // $fisch == $fisch.toString()

    fun essen(fisch: Fisch) {
        println("$this: Mhmmm, ${fisch.toString()} schmeckt soo gut.")
        Thread.sleep(SLEEP_TIME)
    }



}