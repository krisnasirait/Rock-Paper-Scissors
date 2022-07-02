
abstract class Game : Player {


    private var isFirst: Boolean = true
    var nameUser: String = ""

    //to receive the user name input
    fun startGame(): String {
        if (isFirst) {

            isFirst = false

            //read user name input
            print("\nInput your name : ")
            val userName = readln()
            nameUser = userName

            //error handling input contain spaces (" ")
            if (userName.contains(" ")) {
                println("\nPlease input without spaces")
            }

        }
        return nameUser
    }

}