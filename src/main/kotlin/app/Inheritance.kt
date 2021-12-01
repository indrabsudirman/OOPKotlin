package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Indra")
    manager.sayHello("Bubi")

    val vicePresident = VicePresident("Imam")
    vicePresident.sayHello("Indra")
}