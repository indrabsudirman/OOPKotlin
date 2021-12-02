package app

import data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("Sony Xperia Z3", "Android 12")
    println(smartPhone.toString())
    println(smartPhone.hashCode())
}