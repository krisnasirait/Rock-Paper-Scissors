class Player {
    private lateinit var choice: String

    fun getChoice() {

        print("1. Rock \n2. Paper \n3. Scissors\nChoose : ")

        //error handling number exception
        try {
            var choosen = readln().toInt()
            when (choosen) {
                1 -> setChoice("Rock")
                2 -> setChoice("Paper")
                3 -> setChoice("Scissors")
            }
        } catch (e: NumberFormatException) {
            println("\nPlease input the correct option\n")
        }


    }

    fun setChoice(userChoice: String?): String {
        if (userChoice != null) {
            choice = userChoice
        }
        return choice
    }
}