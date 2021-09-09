package Binar

class DoWhileLoop {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var currentIndex = 0
            do{
                println("$currentIndex")
                currentIndex++
            } while(currentIndex <= 10)
        }
    }
}