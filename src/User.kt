class User {
    fun getUserChoice(player: String): String {
        print("Input your choice ($player) [Rock, Paper, Scissors]: ")
        try {
            return readln()
        } catch (e: NumberFormatException) {
            println("\nPlease input the correct option\n")
        }
        throw IllegalArgumentException("Please input the correct option")
    }
}