class GameFlow : Game() {

    private var isFirst: Boolean = true
    var vsHuman: Boolean = false
    var vsBot: Boolean = false
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

            result.showResult(
                getFirstUser(),
                getSecondUser(),
                user.getFirstUserChoice(vsHuman = true, vsBot = false),
                user.getSecondUserChoice()
            )
            playAgain()


        } else if (userMenuChoose == 2) {

            result.showResult(
                getFirstUser(),
                user.getFirstUserChoice(vsHuman = true, vsBot = false),
                computer.getRandomChoice()
            )
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

            print("Back to main menu?(y/n) ")

            var backToMain = readln().lowercase()

            if (backToMain == "n" || backToMain == "no") {

                println("Thankyou for Playing!")

            } else if (backToMain == "y" || backToMain == "yes") {

                isFirst = true

                gameFlow()

            }


        } else if (playMore == "y" || playMore == "yes") {

            isFirst = false

            gameFlow()

        }

    }


}


fun main() {

    val gameFlow = GameFlow()
    gameFlow.gameFlow()

}