interface Player {

    //menu banner to show the game banner
    fun menuBanner() {
        println("=========================")
        println("==Rock--Paper--Scissors==")
        println("=========================")
    }

    fun menuOption(){
        println("1. Human vs Human")
        println("2. Human vs Bot")
        println("3. Exit")
    }

    fun playAgain()
}