class Result() : Game() {

    fun getResult(userChoice: String, botChoice: String, userName: String): String {

        val game = Game()
        val choices = arrayOf("Rock", "Paper", "Scissors")

        if (userChoice == choices[0] && botChoice == choices[0] || userChoice == choices[1] && botChoice == choices[1] || userChoice == choices[2] && botChoice == choices[2]) {

            return "DRAW"

        } else if (userChoice == choices[0] && botChoice == choices[3] || userChoice == choices[1] && botChoice == choices[0] || userChoice == choices[2] && botChoice == choices[2]) {

            return "$userName WIN"

        } else if (userChoice == choices[0] && botChoice == choices[1] || userChoice == choices[1] && botChoice == choices[2] || userChoice == choices[2] && botChoice == choices[0]) {

            return "Bot WIN"
        }

        throw IllegalArgumentException("Can't declare the result")
    }

    fun showResult(userChoice: String, botChoice: String, userName: String) {
        println("======Result=====")
        println(getResult(userChoice, botChoice, userName))
        println("User \nMenang:")

    }
}