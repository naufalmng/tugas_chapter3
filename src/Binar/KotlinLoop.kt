package Binar

fun simpleForLoop(){
    for (i in 0.. 3) // terus looping jika i <= 3
        println("INDEX : $i")

    for (i in 0 until 3) // terus looping jika i < 3
        println("INDEX : $i")

    for (i in 3 downTo 0)
        println("Index Looping negatif : $i")

    for (i in 0..6 step 2)
        println("Index Looping negatif dengan step 2 : $i")

}

fun simpleForEachLoop(){
    val myArray = arrayOf("A","B","C","D")
    for(item in myArray)
        println(" "+item)
}
fun main() {
    simpleForLoop()
}


