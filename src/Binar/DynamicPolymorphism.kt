package Binar

fun main() {
    val bangunDatar = BangunDatar()
    val persegi = Persegi(4)
    val segitiga = Segitiga(6,3)
    val lingkaran = Lingkaran(30)

    // call luas n keliling method
    bangunDatar.luas()
    bangunDatar.keliling()

    println("Luas Persegi: ${persegi.luas()}")
    println("Keliling Persegi: ${persegi.keliling()}")
    println("Luas Segitiga: ${segitiga.luas()}")
    println("Keliling Segitiga: ${segitiga.keliling()}")
    println("Luas Lingkaran: ${lingkaran.luas()}")
    println("Keliling Lingkaran: ${lingkaran.keliling()}")

}

open class BangunDatar{
    open fun luas(): Float{
        println("Menghitung luas bangun datar")
        return 0F
    }
    open fun keliling(): Float{
        println("Menghitung keliling bangun datar")
        return 0F
    }
}

class Persegi(var sisi: Int): BangunDatar(){
    override fun luas(): Float{
        return(sisi*sisi).toFloat()
    }
    override fun keliling(): Float{
        return(sisi*4).toFloat()
    }
}

class Segitiga(var alas: Int, var tinggi: Int): BangunDatar(){
    override fun luas(): Float{
        return super.luas()
    }
}

class Lingkaran(var r: Int): BangunDatar(){
    override fun luas(): Float{
        return (Math.PI*r*r).toFloat()
    }
    override fun keliling(): Float {
        return (2*Math.PI*r).toFloat()
    }
}