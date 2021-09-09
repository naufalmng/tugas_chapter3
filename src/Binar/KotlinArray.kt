package Binar

val num = arrayOf(1,2,3,4) // implicit declarication
val num2 = arrayOf<Int>(1,2,3) // explicit declarication

fun main() {
    val arrayName = arrayOf(1,2,3,4,5)
    val number = Array(5,{i -> i*1})
    for (i in 0 until number.size-1)

    for (i in 0 until arrayName.size-1)
        print(" "+arrayName[i])

    println()

    val arrayName2 = arrayOf<Int>(10,20,30,40,50)
    for (i in 0 until arrayName2.size-1)
        print(" "+arrayName2[i])


}