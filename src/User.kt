class User {

    fun getFirstUserChoice(vsHuman: Boolean, vsBot: Boolean): String {

        val computer = Computer()

        print("Input your choice (1st Player) : ")

        //error handling number exception
        try {
            if (!vsHuman && vsBot) {

                var choosenFirstUser = readln()

                computer.getRandomChoice()

                return choosenFirstUser

            } else if (vsHuman && !vsBot) {

                return readln()
            }
        } catch (e: NumberFormatException) {

            println("\nPlease input the correct option\n")

        }

        throw IllegalArgumentException("Please input the correct option")
    }

    fun getSecondUserChoice(): String {

        print("Input your choice (2nd Player) : ")

        try {

            return readln()

        } catch (e: NumberFormatException) {

            println("\nPlease input the correct option\n")
        }

        throw IllegalArgumentException("Please input the correct option")
    }
}