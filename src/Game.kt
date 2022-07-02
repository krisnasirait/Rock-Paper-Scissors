
abstract class Game : Player {


    private var isFirst: Boolean = true

    //to receive the user name input
    fun startGame(): String {
        while (isFirst) {

            isFirst = false

            //read user name input
            print("\nInput your name : ")
            var userName = readln()

            //error handling input contain spaces (" ")
            if (userName.contains(" ")) {
                println("\nPlease input without spaces")
            }

            return userName
        }

        throw IllegalArgumentException("Username not passed")
    }

}