package app

import data.Person

fun main() {
    val indra = Person()
    indra.firstName = "Indra"

    indra.sayHello("Budi")
    indra.sayHello("Imam", "Pajri")
}