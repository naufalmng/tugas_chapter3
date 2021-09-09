package latihan

import latihan.elements.Paper
import latihan.elements.Rock
import latihan.elements.Scissor

fun main(args: Array<String>) {
    startsuitWithCom()


}
private fun startsuitWithCom(){
    val paper = Paper("paper")
    val rock = Rock("rock")
    val scissors = Scissor("scissors")

    val resultList: List<Suit> = listOf(paper,rock,scissors)
    val compSuit = resultList.random()


    loop@ while(true){
        println("input suit: ")
        val input = readLine()
        val mySuit = when (input) {
            "gunting" -> Scissor(StringContainer.scissors)
            "batu" -> Rock(StringContainer.rock)
            "kertas" -> Paper(StringContainer.paper)
            else -> continue@loop
        }

        val result = mySuit.actionAgainst(compSuit)
        println("you is ${result.status} , you: ${mySuit.name} vs comp: ${compSuit.name}")
    }


}

private fun startSuit(){
    val input1 = readLine()
    val suit1  = when (input1) {
        "gunting" -> Scissor(StringContainer.scissors)
        "batu" -> Scissor(StringContainer.rock)
        "kertas" -> Scissor(StringContainer.paper)
        else -> Suit("nothing else")
    }

    if(suit1.name != "nothing else") {
        val input2 = readLine()
        val suit2 = when (input2) {
            "gunting" -> Scissor(StringContainer.scissors)
            "batu" -> Scissor(StringContainer.rock)
            "kertas" -> Scissor(StringContainer.paper)
            else -> Suit("nothing else")

        }
        if(suit2.name != "nothing else") {
            val resultSuit1 = suit1.actionAgainst(suit2)
            val resultSuit2 = suit1.actionAgainst(suit1)
            println("")
            println("")

            val winnerSuit1 = suit1.actionAgainst(suit2)
            println(winnerSuit1.status)
        }else{
            println("silahkan input kembali")
            startSuit()
        }
    }

}