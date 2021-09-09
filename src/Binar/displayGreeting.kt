package Binar

fun main() {
    fun displayGreeting(message: String,name: String = "Guest"){
        println("Hello $name, $message")

    }
    displayGreeting("Welcome to Binar","John")
}