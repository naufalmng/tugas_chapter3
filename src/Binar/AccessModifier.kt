package Binar

open class Base(){
    var a = 1                   // public by default
    private var b = 2           // private to Base class
    protected open val c = 3    // visible to the base and the derived class
    internal val d = 4          // visible inside the same module
    protected fun e () {}       // visible to base and the derived class
}

class derived: Base(){
    // a, c, d, and e() of the base class are visible
    // b is not visible
    override val c = 9
}

fun main(args: Array<String>) {
    val base = Base()
//    val derived = Derived() //is not visible
}