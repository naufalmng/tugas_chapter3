package Binar

class Pegawai{
    var nama: String = "Naufal"
    get(){
        println("Getter Called")
        return field
    }
    set(value){
        println("Setter Called")
        field = value
    }
}

fun main() {
    val myEmp = Pegawai()
    println("Nama Pegawai: ${myEmp.nama}")
    myEmp.nama = "Ujank"
    println("Nama Pegawai: ${myEmp.nama}")
}