class Game {

    private var isRunning: Boolean = false
    private var isFirst: Boolean = true
    private lateinit var nameUser: String

    //menu banner to show the game banner
    private fun menuBanner() {
        println("=========================")
        println("==Rock--Paper--Scissors==")
        println("=========================")
    }


    //to received the user name input
    fun startGame(): String {
        while (isFirst) {

            isFirst = false
            menuBanner()

            //read user name input
            print("\nInput your name : ")
            nameUser = readln()

            //error handling input contain spaces (" ")
            if (nameUser.contains(" ")) {
                println("\nPlease input without spaces")
                startGame()
            }
        }

        isRunning = true

        while (isRunning) {
            val player = Player()
            player.getChoice()
        }

        return nameUser
    }
}