package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student: Student? = Student("Indra", 18)
    student.sayHello("Pajri")
    println(student?.upperName)
}