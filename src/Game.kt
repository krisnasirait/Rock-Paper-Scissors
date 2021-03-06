abstract class Game : Player {
    companion object {
        var nameFirstUser: String = ""
        var nameSecondUser: String = ""
    }


    //to receive the user name input
    fun getFirstUser(): String {
        if (nameFirstUser == "") {
            //read user name input
            print("\nInput your name (1st Player) : ")
            val firstUserName = readln()
            nameFirstUser = firstUserName
            //error handling input contain spaces (" ")
            if (nameFirstUser.contains(" ")) {
                println("\nPlease input without spaces")
            }
        }
        return nameFirstUser
    }

    fun getSecondUser(): String {
        if (nameSecondUser == "") {
            print("Input your name (2nd Player) : ")
            val secondUserName = readln()
            nameSecondUser = secondUserName
            if (nameSecondUser.contains(" ")) {
                println("Please input without spaces")
            }
        }
        return nameSecondUser
    }


}