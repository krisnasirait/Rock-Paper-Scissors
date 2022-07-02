class GameFlow : Game() {

    private var isFirst: Boolean = true
    private var userMenuChoose: Int = 0

    fun gameFlow() {
        val user = User()
        val result = Result()
        val computer = Computer()

        while (isFirst) {

            isFirst = false

            menuBanner()
            menuOption()
            var userChoose = readln().toInt()
            userMenuChoose = userChoose
        }



        if (userMenuChoose == 1) {

        } else if (userMenuChoose == 2) {

            result.showResult(getFirstUser(), user.getUserChoice(), computer.getRandomChoice())
            playAgain()

        } else if (userMenuChoose == 3) {

            println("Thankyou for Playing!")

        } else {

            menuOption()
            gameFlow()

        }


    }

    override fun playAgain() {

        print("\nPlay again?(y/n) ")

        var playMore = readln().lowercase()

        if (playMore == "n" || playMore == "no") {

            println("Thankyou for Playing!")

        } else if (playMore == "y" || playMore == "yes") {
            gameFlow()

        }

    }


}


fun main() {
    val gameFlow = GameFlow()
    gameFlow.gameFlow()
}