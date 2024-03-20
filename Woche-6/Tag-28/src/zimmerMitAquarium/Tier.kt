package zimmerMitAquarium

open class Tier(val spitzname: String, val canFly: Boolean,val canSwim: Boolean) {


    override fun toString(): String {
        return "${this.spitzname} kann ${if (this.canFly) "fliegen" else "nicht fliegen"} und kann " +
                "${if (this.canSwim) "schwimmen" else "nicht schwimmen"}"
    }
    fun essen(){
        println("${this.spitzname} isst")
    }
}