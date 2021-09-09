package Binar.ChallangeChapter3

class GameSuit {
    fun suit(JawabanPemain1: String, JawabanPemain2: String) { // suit function

        val jp1 = JawabanPemain1
        val jp2 = JawabanPemain2

        val suit = arrayListOf("gunting","kertas","batu") // attribut suit

        // kemungkinan-kemungkinan menang suit pemain 1
        if(jp1.equals(suit.get(0)) && jp2.equals(suit.get(1)) ||
            jp1.equals(suit.get(2)) && jp2.equals(suit.get(0)) ||
            jp1.equals(suit.get(1)) && jp2.equals(suit.get(2)))
            println("Pemain 1 MENANG!")

        // kemungkinan-kemungkinan menang suit pemain 2
        else if(jp1.equals(suit.get(0)) && jp2.equals(suit.get(2)) ||
            jp1.equals(suit.get(1)) && jp2.equals(suit.get(0)) ||
            jp1.equals(suit.get(2)) && jp2.equals(suit.get(1)))
            println("Pemain 2 MENANG!")

        else{
            println("DRAW!")
        }
    }
}