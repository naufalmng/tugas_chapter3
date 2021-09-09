package Binar

class WhileLoop {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var currentIndex = 0
            while (currentIndex <= 10)
                println("$currentIndex")
            currentIndex++
        }
    }
}