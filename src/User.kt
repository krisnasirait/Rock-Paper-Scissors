class User {

    fun getUserChoice(): String{

        val computer = Computer()

        print("Input your choice: ")

        //error handling number exception
        try {
            var choosen = readln()
            computer.getRandomChoice()
            return choosen

        } catch (e: NumberFormatException) {
            println("\nPlease input the correct option\n")
        }

        throw IllegalArgumentException("Please input the correct option")
    }
}