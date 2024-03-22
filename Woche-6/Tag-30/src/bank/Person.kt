package bank

open class Person(
    val name: String,
    val geburtsDatum: String,   // Format: TT.MM.JJJJ
) {

    val alter: Int
        get() {
            return geburtsDatum.zuAlter()
        }

    override fun toString(): String {
        return "$name, $geburtsDatum"
    }
}