import farben.*


fun main(){

    val flugzeugArt: String = """
            __!__
        _____(_)_____
           !  !  !
    """.trimIndent()

    println("$rot$flugzeugArt$reset")

    val beispiel = """
        Das hier ist ${rot}rot${reset} mit ${rotBack}rotem Hintergrund${reset}. 
        Jetzt ist wieder alles normal.
        
        $gruen WOW ein grüner Text!$reset
        
        Hier eine unterstrichtene Zahl $UNDERLINE 500,99€ $reset
        
        ${gelb}${blauBack} Gelb-blaue Schrift?! wie cool!
    """.trimIndent()
    println(beispiel)
    println() // leere Zeile
    println("Ooops! \u001B[0m ich hatte wohl das Reset vergessen :O !")


    println("\u001B[33mHallo Welt!$reset")


    println("""
    @@          @@
    @@@        @@@
    @@@@      @@@@   @@@@  @@ @@@  @@ @@@ @@      @@
    @@ @@    @@ @@  @@  @@ @@@  @@ @@@  @@ @@    @@
    @@  @@  @@  @@ @@@@@@  @@      @@       @@  @@
    @@   @@@@   @@  @@     @@      @@        @@@@
    @@    @@    @@   @@@@  @@      @@         @@
                                             @@
                                        @@  @@
                                         @@@@
   @@@   @@              @@          @@
 @@   @@ @@                          @@
@@       @@ @@@  @@ @@@  @@   @@@@ @@@@@@  @@ @@  @@      @@@    @@@@
@@       @@@  @@ @@@  @@ @@  @@      @@    @@@  @@  @@  @@  @@  @@
@@       @@   @@ @@      @@   @@@    @@    @@   @@  @@ @@   @@   @@@
 @@   @@ @@   @@ @@      @@     @@   @@ @@ @@       @@ @@   @@     @@
   @@@   @@   @@ @@       @@ @@@@     @@   @@       @@  @@@@ @@ @@@@
    """.trimIndent())
}