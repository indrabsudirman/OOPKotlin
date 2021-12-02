package app

import data.MandarinTeacher
import data.Teacher

fun main() {
    val teacher = MandarinTeacher("Indra")
    println(teacher.name)
    teacher.teach()

    teacher.test()
}