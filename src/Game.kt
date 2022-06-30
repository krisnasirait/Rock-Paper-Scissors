class Game {

    private var isRunning: Boolean = false
    private var isFirst: Boolean = true

    //menu banner to show the game banner
    fun menuBanner() {
        println("=========================")
        println("==Rock--Paper--Scissors==")
        println("=========================")
    }


    //to received the user name input
    fun startGame() {
        while (isFirst) {
            isFirst = false
            menuBanner()
        }

        isRunning = true

        while (isRunning) {
            //read user name input
            print("\nInput your name : ")
            val nameUser = readln()
            //error handling input contain spaces (" ")
            if (nameUser.contains(" ")) {
                println("\nPlease input without spaces")
                startGame()
            }
        }
    }
}