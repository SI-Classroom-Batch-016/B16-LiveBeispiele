package aquarium

class Aquarium (var capazitaet: Int) {

    var wasserSauber: Boolean = true
    val tiere: MutableList<Tier> = mutableListOf()
    var wasserTemp: Int = 20


    fun wasserWechseln(){
        if (this.wasserSauber)
            println("Das Wasser ist bereits sauber.")
        else {
            println("Das Wasser wurde gewechselt.")
            this.wasserSauber = true
        }
    }

    fun fischeFuettern(){

        println("-----")
        println("Wir füttern alle Fische: ")
        Thread.sleep(2 * SLEEP_TIME)

        for (tier in this.tiere){
            if (tier is Fisch){
                tier.essen()
            }
        }

        // Durch das Futter wird das Wasser schmutzig
        println("Durch das Futter wurde das Wasser schmutzig")
        this.wasserSauber = false
    }

    fun haieFuettern(){

        val haie: List<Hai> = this.tiere.filterIsInstance<Hai>()

        // val waffen: List<Item> = listOf()
        // val schwerter: List<Schwert> = waffen.filterIsInstance<Schwert>()

        // Wenn es Haie gibt, müssen diese noch gefüttert werden
        if (haie.isNotEmpty()) {

            println("-----")
            println("Wir füttern jetzt noch die Haifische... ")
            Thread.sleep(SLEEP_TIME / 2)
            println("...dafür muss uns leider ein Fisch verlassen... ")
            Thread.sleep(SLEEP_TIME / 2)

            val goldFische: List<Goldfisch> = this.tiere.filterIsInstance<Goldfisch>()

            // Wenn es keine Goldfische gibt, gehen die Haie leer aus.
            if (goldFische.isEmpty()) {
                println("...es gibt aber keine Goldfische....")
                Thread.sleep(SLEEP_TIME / 2)
                println("...d.h. die Haie bleiben hungrig :'( ")
                Thread.sleep(SLEEP_TIME * 2)
            } else {
                // Ein zufälliger Goldfisch muss dran glauben, die Haie teilen sich die Beute
                val futter: Goldfisch = goldFische.random()
                println("...$futter wird von den Haien gegessen :(")
                Thread.sleep(SLEEP_TIME * 2)

                for (hai in haie) {
                    hai.essen(futter)
                }

                // Noch den Goldfisch aus dem Aquarium nehmen
                this.tiere.remove(futter)

            }
        }
    }

    fun alleTiereFuettern(){
        println("-----")
        println("Wir füttern alle Tiere: ")
        Thread.sleep(2 * SLEEP_TIME)

        // Erst alle Tiere füttern
        for (tier in this.tiere){
            tier.essen()
        }

        // Haie werden einzeln gefüttert
        this.haieFuettern()

        // Durch das Futter wird das Wasser schmutzig
        this.wasserSauber = false
    }

}