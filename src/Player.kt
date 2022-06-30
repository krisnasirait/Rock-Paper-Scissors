class Player {
    private lateinit var choice: String

    fun getChoice() {
        print("1. Rock \n2. Paper \n3. Scissors\nChoose : ")
        var choosen = readln().toInt()
        when (choosen) {
            1 -> setChoice("Rock")
            2 -> setChoice("Paper")
            3 -> setChoice("Scissors")
        }
    }

    fun setChoice(userChoice: String?): String {
        if (userChoice != null) {
            choice = userChoice
        }
        print(choice)
        return choice
    }
}