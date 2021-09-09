package Binar

class User (val firstName: String, val lastName: String) {
    fun getFullName(): String{
        return firstName + " " + lastName
    }

}
fun main(args: Array<String>) {
    val user = User("Naufal","Hanif")
    println("Display Name :${user.getFullName()}")
}