class User {

    fun getUserChoice(){

        val computer = Computer()

        print("Input your choice: ")

        //error handling number exception
        try {
            var choosen = readln()
            computer.getRandomChoice(choosen)

        } catch (e: NumberFormatException) {
            println("\nPlease input the correct option\n")
        }
    }
}