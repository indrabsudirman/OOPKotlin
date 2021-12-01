package app

import data.Car

fun main() {
    val innova = Car("Toyota")
    innova.year = 2021
    val almaz = Car("Wuling", "Almaz")

    println(innova.brand)
    println(innova.year)
    println(almaz.brand)
    println(almaz.year)
}