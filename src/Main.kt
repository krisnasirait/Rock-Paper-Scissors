class GameFlow : Game() {

    private var isFirst: Boolean = true
    private var vsHumanFirst: Boolean = true
    private var userMenuChoose: Int = 0

    fun gameFlow() {

        val user = User()
        val result = Result()
        val computer = Computer()

        while (isFirst) {

            isFirst = false

            menuBanner()
            menuOption()

            val userChoose = readln().toInt()

            userMenuChoose = userChoose
        }


        when (userMenuChoose) {
            1 -> {

                if (vsHumanFirst) {
                    result.showResult(
                        getFirstUser(),
                        getSecondUser(),
                        user.getFirstUserChoice(vsHuman = true, vsBot = false),
                        user.getSecondUserChoice()
                    )
                    vsHumanFirst = false
                } else if (!vsHumanFirst) {
                    val firstUserName = nameFirstUser
                    val secondUserName = nameSecondUser

                    result.showResult(
                        firstUserName,
                        secondUserName,
                        user.getFirstUserChoice(vsHuman = true, vsBot = false),
                        user.getSecondUserChoice()
                    )
                }

                playAgain()


            }
            2 -> {

                result.showResult(
                    getFirstUser(),
                    user.getFirstUserChoice(vsHuman = false, vsBot = true),
                    computer.getRandomChoice()
                )
                playAgain()

            }
            3 -> {

                println("Thankyou for Playing!")


            }
            else -> {

                isFirst = true
                gameFlow()

            }
        }


    }

    override fun playAgain() {

        print("\nPlay again?(y/n) ")

        val playMore = readln().lowercase()

        if (playMore == "n" || playMore == "no") {

            print("Back to main menu?(y/n) ")

            val backToMain = readln().lowercase()

            if (backToMain == "n" || backToMain == "no") {

                println("Thankyou for Playing!")

            } else if (backToMain == "y" || backToMain == "yes") {


                gameFlow()


            }


        } else if (playMore == "y" || playMore == "yes") {


            gameFlow()

        }
    }


}


fun main() {

    val gameFlow = GameFlow()
    gameFlow.gameFlow()

}