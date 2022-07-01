open class Game : Player {


    private var isFirst: Boolean = true

    //to receive the user name input
    fun startGame() {
        while (isFirst) {

            isFirst = false

            menuBanner()

            //read user name input
            print("\nInput your name : ")
            var userName = readln()

            //error handling input contain spaces (" ")
            if (userName.contains(" ")) {
                println("\nPlease input without spaces")
                startGame()
            }
        }

        val user = User()
        user.getUserChoice()
    }

}