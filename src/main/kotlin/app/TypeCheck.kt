package app

import data.Customer
import data.HandPhone
import data.Laptop


fun printObject(any: Any) {

    if (any is Laptop) {
        println("Laptop name is ${any.name}")
    } else if (any is HandPhone) {
        println("Handphone name is ${any.name}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {

    when (any) {
        is Laptop -> println("Laptop name is ${any.name}")
        is HandPhone -> println("Handphone name is ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any) {
    val value: String? = any as? String
    println(value)
}

fun main() {
    printString("Jabriko")
//    printString(19)  //ClassException karena dipaksa pakai as

    printStringSafe("Indra Sudirman")
    printStringSafe(20) //pasti null

    printObjectWithWhen("Indra")
    printObjectWithWhen(1)
    printObjectWithWhen(2.0)
    printObjectWithWhen(Laptop("Acer"))
    printObjectWithWhen(HandPhone("Sony Xperia"))
    printObjectWithWhen(Customer("Indra"))

}