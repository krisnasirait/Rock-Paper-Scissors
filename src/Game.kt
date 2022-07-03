
abstract class Game : Player {

    private var isFirst: Boolean = true

    companion object{
        var nameFirstUser: String = ""
        var nameSecondUser: String = ""
    }


    //to receive the user name input
    fun getFirstUser(): String {
        if (isFirst) {

            isFirst = false

            //read user name input
            print("\nInput your name : ")

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

        print("\nInput your name : ")

        val secondUserName = readln()

        nameSecondUser = secondUserName

        if(nameSecondUser.contains(" ")){
            println("\nPlease input without spaces")
        }

        return nameSecondUser
    }



}