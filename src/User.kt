class User {

    private lateinit var choice: String

    fun getUserChoice(){
        print("1. Rock \n2. Paper \n3. Scissors\nChoose : ")

        //error handling number exception
        try {
            var choosen = readln().toInt()
            when (choosen) {
                1 -> setUserChoice("Rock")
                2 -> setUserChoice("Paper")
                3 -> setUserChoice("Scissors")
            }
        } catch (e: NumberFormatException) {
            println("\nPlease input the correct option\n")
        }
    }

    fun setUserChoice(userChoice: String?) {
        if (userChoice != null) {
            choice = userChoice
        }
        val computer = Computer(choice)
    }
}