package data

class User (var username: String, var password: String) {

    override fun toString(): String {
        return "User name is = $username"
    }

//    override fun toString(): String {
//        return super.toString()
//    }

}