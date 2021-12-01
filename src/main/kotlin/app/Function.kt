package app

import data.Person

fun main() {
    val indra = Person()
    indra.firstName = "Indra"
    indra.middleName = "Bayu"
    indra.lastName = "Sudirman"

    indra.sayHello(" Imam")

    indra.run()

    indra.getFullName()

    val fullName = indra.getFullName()
    println(fullName)
}