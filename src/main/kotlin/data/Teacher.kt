package data

open class Teacher(val name: String) {
    fun teach() {
        println("Teach!")
    }

    open protected fun test() {
        println("Test")
    }

}

class MandarinTeacher (jadwal: String) : Teacher("Indra") {
    override public fun test() {
        super.test()
    }
}


