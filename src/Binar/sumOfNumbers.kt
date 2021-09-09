package Binar

fun sumOfNumbers(vararg numbers:Double):Double{
    var sum: Double = 0.0

    for(n in numbers)
        sum+=n

    return sum
}

fun main(args: Array<String>) {
    sumOfNumbers(1.5, 2.0)
}