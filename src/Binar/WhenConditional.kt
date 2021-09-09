package Binar

fun whenControlFlow(sayaLapar: Boolean){
    when(sayaLapar){
        true -> println("Saya harus makan")
        else -> println("Saya sudah kenyang")
    }
}

fun whenControlFlowConditional(sayaLapar: Boolean){
    when{
        sayaLapar -> println("Saya harus makan")
        else -> println("Saya sudah kenyang")
    }
}

fun checkNilaiRange(nilai: Int){
    when(nilai){
        0 -> println("Kamu tidak lulus, silahkan coba lagi !")
        in 1..6 -> println("Selamat ya, kamu lulus!")
    }
}
fun main(args: Array<String>) {

}


