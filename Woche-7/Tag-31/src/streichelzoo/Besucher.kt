class Besucher(var name: String, var alter: Int = (4..25).random()) {

    fun vorstellen() {
        println("Hi, mein Name ist '$name' und ich bin $alter Jahre alt :)")
    }

}