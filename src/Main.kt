

class GameFlow : Game() {

    private var init: Boolean = true
    private var userMenuChoose: Int = 0
    private var firstPlayerScore: Int = 0
    private var secondPlayerScore: Int = 0
    private var secondPlayerPseudonym: String = ""

    fun gameFlow() {

        val user = User()
        val result = Result()
        val computer = Computer()

        while (init) {
            init = false
            resetData()
            menuBanner()
            menuOption()
            val userChoose = readln().toInt()
            userMenuChoose = userChoose
        }

        when (userMenuChoose) {
            1 -> {
                getFirstUser()
                getSecondUser()
                secondPlayerPseudonym = nameSecondUser
                val gameResult = result.getResult(user.getUserChoice("1st player"), user.getUserChoice("2nd player"))
                storeGameResult(gameResult)
                result.showResult(getFirstUser(), getSecondUser(), result = gameResult)
                playAgain()
            }
            2 -> {
                secondPlayerPseudonym = "Computer"
                val botChoice = computer.getRandomChoice()
                getFirstUser()
                val gameResult = result.getResult(user.getUserChoice("1st player"), botChoice)
                println("Bot : $botChoice")
                storeGameResult(gameResult)
                result.showResult(getFirstUser(), result = gameResult)
                playAgain()
            }
            3 -> {
                println("Thank you for Playing!")
            }
            else -> {
                init = true
                gameFlow()
            }
        }
    }

    private fun resetData() {
        firstPlayerScore = 0
        secondPlayerScore = 0
        nameFirstUser = ""
        nameSecondUser = ""
    }

    override fun playAgain() {
        println("\nScore:")
        println("$nameFirstUser: $firstPlayerScore")
        println("$secondPlayerPseudonym: $secondPlayerScore")
        print("\nPlay again?(y/n) ")
        val playMore = readln().lowercase()
        if (playMore == "n" || playMore == "no") {
            print("Back to main menu?(y/n) ")
            val backToMain = readln().lowercase()
            if (backToMain == "n" || backToMain == "no") {
                println("Thankyou for Playing!")
            } else if (backToMain == "y" || backToMain == "yes") {
                init = true
                gameFlow()
            }
        } else if (playMore == "y" || playMore == "yes") {
            gameFlow()
        }
    }

    private fun storeGameResult(result: Int) {
        if (result > 0) {
            firstPlayerScore++
        } else if (result < 0) {
            secondPlayerScore++
        }
    }
}


fun main() {
    val gameFlow = GameFlow()
    gameFlow.gameFlow()

}