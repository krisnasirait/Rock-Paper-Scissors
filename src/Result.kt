class Result {

    private var firstUserPoints: Int = 0
    private var secondUserPoints: Int = 0
    private var botPoints: Int = 0

    fun getResult(userName: String, userChoice: String, botChoice: String): String {

        val choices = arrayOf("Rock", "Paper", "Scissors")

        if (userChoice == choices[0] && botChoice == choices[0] || userChoice == choices[1] && botChoice == choices[1] || userChoice == choices[2] && botChoice == choices[2]) {

            return "DRAW"

        } else if (userChoice == choices[0] && botChoice == choices[2] || userChoice == choices[1] && botChoice == choices[0] || userChoice == choices[2] && botChoice == choices[1]) {

            firstUserPoints++
            return "$userName WIN"

        } else if (userChoice == choices[0] && botChoice == choices[1] || userChoice == choices[1] && botChoice == choices[2] || userChoice == choices[2] && botChoice == choices[0]) {

            botPoints++
            return "Bot WIN"
        }


        throw IllegalArgumentException("Can't declare the result")
    }

    fun getResult(
        firstUserName: String, secondUserName: String, firstUserChoice: String, secondUserChoice: String
    ): String {

        val choices = arrayOf("Rock", "Paper", "Scissors")

        if (firstUserChoice == choices[0] && secondUserChoice == choices[0] || firstUserChoice == choices[1] && secondUserChoice == choices[1] || firstUserChoice == choices[2] && secondUserChoice == choices[2]) {

            return "DRAW"

        } else if (firstUserChoice == choices[0] && secondUserChoice == choices[2] || firstUserChoice == choices[1] && secondUserChoice == choices[0] || firstUserChoice == choices[2] && secondUserChoice == choices[1]) {

            firstUserPoints++
            return "$firstUserName WIN"

        } else if (firstUserChoice == choices[0] && secondUserChoice == choices[1] || firstUserChoice == choices[1] && secondUserChoice == choices[2] || firstUserChoice == choices[2] && secondUserChoice == choices[0]) {

            secondUserPoints++
            return "$secondUserChoice WIN"
        }


        throw IllegalArgumentException("Can't declare the result")
    }

    fun showResult(userName: String, userChoice: String, botChoice: String) {
        println("Bot : " + botChoice)
        println("======Result=====")
        println(getResult(userName, userChoice, botChoice))
        println("\n" + userName + " : " + firstUserPoints.toString())
        println("Bot" + " : " + botPoints.toString())

    }

    fun showResult(firstUserName: String, secondUserName: String, firstUserChoice: String, secondUserChoice: String){

        println("======Result=====")
        println(getResult(firstUserName, secondUserName, firstUserChoice, secondUserChoice))
        println("\n" + firstUserName + " : " + firstUserPoints.toString())
        println(secondUserName + " : " + secondUserPoints.toString())
    }
}