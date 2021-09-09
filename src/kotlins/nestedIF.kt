package kotlins

class nestedIF {
    // val tidak dapat diubah nilainya
    // var dapat diubah nilainya
    val n1 = 3
    val n2 = 5
    val n3 = -2
    val max = if(n1>n2){
        if (n1>n3)
            n1
            else n3

    }   else {
        if (n2 > n3)
            n2
        else
            n3
    }
}