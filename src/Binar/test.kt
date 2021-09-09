package Binar

fun main(args: Array<String>) {
    function01()
    watcherOne()
    str(b= 2)
    val tes ="test"
    val tes2 = tes.removeLastChar()
    println(tes2)
}
fun function01(): Unit{
    println("Halo")
}
fun function02(): String{
    return "Halo"
}
fun function03(vararg a: Int) {
 var current = 0
    for(angka in a){
        current += angka
    }
}
fun String.removeLastChar(): String {
    return this.dropLast(1)
}

fun watcher(): String{
    val readable = readLine()
    return if (readable?.toIntOrNull() != null){
        watcher()
    }else{
        readable!!
    }
}
fun watcherOne(): String? {
    val readable = readLine()
    return if (readable?.toIntOrNull() != null){
        println("is Integer")
        watcher()
    }else if((readable?.length ?:0) == 1){
        readable
    }else{
        readable
    }
}
// var variable: String? -> bisa diisi null
// var variable: String -> tidak bisa diisi null

fun str(a: Int = 1, b: Int = 2): Int{
    return a+b
}