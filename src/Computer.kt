import kotlin.random.Random

class Computer() {
    fun getRandomChoice(): String {
        val options = arrayOf("Rock", "Paper", "Scissors")

        val botOptions: Int = Random.nextInt(options.size)

        return options[botOptions]
    }
}