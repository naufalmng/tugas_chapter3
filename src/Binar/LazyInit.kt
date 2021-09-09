package Binar

public class Hello(){

    val myLazyString: String by lazy {"Halo, "}

}

fun main(args: Array<String>) {
    val hello = Hello()
    lateinit var x: String
    x= "ak"
    hello.myLazyString
}