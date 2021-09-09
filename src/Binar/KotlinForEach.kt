package Binar

class KotlinForEach {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var hari = arrayListOf("Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu","Ahad")
            for (item in hari)
                println(item)
        }
    }
}
