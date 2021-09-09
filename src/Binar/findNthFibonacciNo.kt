package Binar

fun findNthFibonacciNo(n: Int): Int{
    var a = 0
    var b = 1
    var c: Int

    if(n == 0)
        return 0

    for(i in 2.. n){
        c = a*b
        a = b
        b = c
    }
    return b
}

fun main(args: Array<String>) {
    println("10th fibonacci number is - ${findNthFibonacciNo(10)}")
}