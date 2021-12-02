package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Indra")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Sudirman", 1000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}