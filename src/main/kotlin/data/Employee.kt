package data

open class Employee(val name: String) {

    open fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name) {
    //Function Overriding
    final override fun sayHello(name: String) {
        println("Hello $name, My name is Manager ${this.name}")
    }
}

class SuperManager (name: String) : Manager(name) {
    //Function on class Manager has declared as Final
//    override fun sayHello(name: String) {
//        println("Hello $name, My name is Super Manager ${this.name}")
//    }
}

class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, My name is Vice President ${this.name}")
    }
}