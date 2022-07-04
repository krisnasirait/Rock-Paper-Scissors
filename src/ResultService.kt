class ResultService constructor(private var userChoice: String, private var botChoice: String) {

    fun getResult(): Int {
        if (userChoice.equals(botChoice, true)) {
            return 0
        } else if (userChoice.equals("Rock", true) && botChoice.equals("Scissors", true)
            || userChoice.equals("Paper", true) && botChoice.equals("Rock", true)
            || userChoice.equals("Scissors", true) && botChoice.equals("Paper", true)) {
            return 1
        } else if (botChoice.equals("Rock", true) && userChoice.equals("Scissors", true)
            || botChoice.equals("Paper", true) && userChoice.equals("Rock", true)
            || botChoice.equals("Scissors", true) && userChoice.equals("Paper", true)) {
            return -1
        }
        throw IllegalArgumentException("Can't declare the result")
    }

    fun showResult(firstUserName: String, secondUserName: String = "Bot", result: Int) {
        println("======Result=====")
        if (result > 0) {
            println("$firstUserName WIN")
        } else if (result < 0) {
            println("$secondUserName WIN")
        } else {
            println("DRAW")
        }
    }
}