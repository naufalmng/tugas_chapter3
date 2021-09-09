package Binar

    fun String.RemoveFirstLastChar(): String = this.substring(1,this.length - 1)

fun main(args: Array<String>) {
    val myString = "Hello everyone"
    val result = myString.RemoveFirstLastChar()
    println("First character is : $result")
}