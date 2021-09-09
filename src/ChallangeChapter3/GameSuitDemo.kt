package Binar.ChallangeChapter3

import java.util.*
import kotlin.system.exitProcess

/**
 * Parent Class
 * GAME SUIT TERMINAL VERSION 1.0
 */
fun main(){
    val input = Scanner(System.`in`) // Scanner
    println("\nSELAMAT DATANG DI PERMAINAN GUNTING BATU KERTAS TERMINAL VERSION, \n" +
            "UNTUK MEMULAI PERMAINAN KETIK 'play' \n" +
            "UNTUK KELUAR DARI PERMAINAN KETIK 'quit' \n")


    while(true) {
        print("-> ")
        val jawaban1 = input.next().toLowerCase()  // Jawaban Pemain

        if(jawaban1.equals("quit")){
            println("->Terima Kasih Telah Bermain !")
            exitProcess(1)
        }

        if(!jawaban1.equals("quit") && !jawaban1.equals("play")){
            println()
            println("-> Keyword yang anda masukkan tidak valid !")
            println()
        }

        if(jawaban1.equals("play"))
            break
    }
    println("==========================")
    println("GAME SUIT TERMINAL VERSION")
    println("==========================")
    loopWhile@ while(true) {

//            println("<- Ketik gunting/batu/kertas ->")
            print("Masukkan pemain 1: ")
            val jp1 = input.next().toLowerCase() // Jawaban Pemain 1

            if (!jp1.equals("gunting") && !jp1.equals("batu") && !jp1.equals("kertas")) {
                println()
                println("-> Keyword yang anda masukkan tidak valid !")
                println()
                continue@loopWhile
            }
            else{
                print("Masukkan pemain 2: ")
                val jp2 = input.next().toLowerCase()  // Jawaban Pemain 2

                if (!jp2.equals("gunting") && !jp2.equals("batu") && !jp2.equals("kertas")) {
                    println()
                    println("-> Keyword yang anda masukkan tidak valid !")
                    println()
                    continue@loopWhile
                }
                println()
                println("Hasil: ")

                var mulai = GameSuit()
                mulai.suit(jp1, jp2)
            }
        println()
        println("-> Apakah anda ingin melanjutkan permainan ? ya/tidak")
        print("-> ")
        val jawaban2 = input.next().toLowerCase()  // Jawaban Pemain

        if (jawaban2.equals("ya")){
            println()
            continue@loopWhile
        }

        if (jawaban2.equals("tidak")) {
            println("-> Terima Kasih Telah Bermain !")
            exitProcess(1)
        }

        if (!jawaban2.equals("ya") && !jawaban2.equals("tidak")){
            println()
            println("-> Keyword yang anda masukkan tidak valid !")
            println()
        }
    }
}