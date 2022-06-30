class Game {

    private var isRunning: Boolean = false

    //menu banner to show the game banner
    fun menuBanner(){
        println("=========================")
        println("==Rock--Paper--Scissors==")
        println("=========================")
    }


    //to received the user name input
    fun startGame(){
        isRunning = true
        print("Input your name : ")
        val nameUser = readln()
    }
}