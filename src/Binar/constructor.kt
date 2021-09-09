package Binar

fun main(args: Array<String>) {
    val stu = Murid("Naufal",1)
}

open class Sekolah {
    constructor(nama: String,umur: Int){
        println("Parent Class Constructor")
        println("Nama Murid: ${nama.toUpperCase()}")
        println("Umur Murid: $umur")


    }
//    open fun Pekerja(){}
}
class Murid: Sekolah {
    constructor(name: String,umur: Int): super(name,umur){
    println("Child Class Constructor")
    println("Nama Murid: $name")
    println("Umur Murid: $umur")
    }
}
//class Obsekolah: Sekolah("",1) {
//    override fun Pekerja(){
//        super.Pekerja()
//    }
//
//}

//class Lingkaran{
//    fun luas(r: Float): Float {
//        return (Math.PI * r * r).toFloat()
//    }
//    // overloading function = static polymorphism
//    fun luas(d: Double): Double {
//        return (1/4*Math.PI*d)
//    }
//}