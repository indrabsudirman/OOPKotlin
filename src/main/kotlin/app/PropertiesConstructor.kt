package app

import data.User

fun main() {

    val user1 = User("Indra", "rahasia")
    val user2 = User("Jabriko", "rahasiasekali")

    user1.username = "Sudirman"
    user1.password = "sangat rahasia"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
}