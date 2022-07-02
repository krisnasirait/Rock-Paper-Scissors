import kotlin.Result

class GameFlow : Game(){

    fun gameFlow(){
        menuBanner()

        val user = User()
        val result = Result()
        val computer = Computer()


        result.showResult(startGame(),user.getUserChoice(), computer.getRandomChoice())
    }

    override fun playAgain() {

    }



}


fun main() {
    val gameFlow = GameFlow()
    gameFlow.gameFlow()
}