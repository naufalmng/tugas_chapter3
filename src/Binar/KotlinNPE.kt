package Binar

class KotlinNPE {
    fun main(args: Array<String>) {
        var nama: String? = "abcd"
        nama = null

        val a = "kotlin"
        val b: String? = null
        println(b?.length)
        println(a?.length)
    }
}