package aquarium

open class Tier(
    var spitzname: String,
    open var canFly: Boolean,
    open var canSwim: Boolean
) {

    open fun essen() {
        println("${this.toString()}: Mhmm lecker, danke!")

        Thread.sleep(SLEEP_TIME)        // 10 ms (milli Sekunden) das Programm anhalten
    }

    override fun toString(): String {
        return "${this.spitzname} (${super.toString()})"
    }

}