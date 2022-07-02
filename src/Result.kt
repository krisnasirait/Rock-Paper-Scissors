class Result {

    private var userPoints: Int = 0
    private var botPoints: Int = 0
    private var drawPoints: Int = 0

    fun getResult(userName: String, userChoice: String, botChoice: String): String {

        val choices = arrayOf("Rock", "Paper", "Scissors")

        if (userChoice == choices[0] && botChoice == choices[0] || userChoice == choices[1] && botChoice == choices[1] || userChoice == choices[2] && botChoice == choices[2]) {

            println("Bot : " + botChoice)
            return "DRAW"

        } else if (userChoice == choices[0] && botChoice == choices[2] || userChoice == choices[1] && botChoice == choices[0] || userChoice == choices[2] && botChoice == choices[2]) {

            println("Bot : " + botChoice)
            userPoints++
            return "$userName WIN"

        } else if (userChoice == choices[0] && botChoice == choices[1] || userChoice == choices[1] && botChoice == choices[2] || userChoice == choices[2] && botChoice == choices[0]) {

            println("Bot : " + botChoice)
            botPoints++
            return "Bot WIN"
        }


        throw IllegalArgumentException("Can't declare the result")
    }

    fun showResult(userChoice: String, botChoice: String, userName: String) {
        println("======Result=====")
        println(getResult(userChoice, botChoice, userName))
        println("\n"+ userName + " : " + userPoints.toString())
        println("\nBot" + " : " + botPoints.toString())

    }
}