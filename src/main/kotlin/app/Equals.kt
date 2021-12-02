package app

import data.Company

fun main() {
    val company1 = Company("Indra")
    val company2 = Company("Indra")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)
}