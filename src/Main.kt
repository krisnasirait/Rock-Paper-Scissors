import kotlin.Result

class GameFlow : Game() {

    private var isFirst: Boolean = true

    fun gameFlow() {

        while (isFirst) {

            isFirst = false

            menuBanner()
        }

        val user = User()
        val result = Result()
        val computer = Computer()


        result.showResult(startGame(), user.getUserChoice(), computer.getRandomChoice())
        playAgain()
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