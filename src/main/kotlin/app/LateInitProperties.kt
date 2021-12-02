package app

import data.Television

fun main() {
    val tv = Television()
    tv.initTelevision("Samsung")
    //bisa juga seperti ini inisialisasinya
    tv.brand = "Sony" // output Sony, karena ditiban
    println(tv.brand)
}