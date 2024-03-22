package aquarium

private val eierRange: IntRange = 0..2

class Schildkroete(name: String): Tier(name, false, true) {

    var eierProTag: Int = eierRange.random()
}
