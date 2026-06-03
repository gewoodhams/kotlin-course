class Person (val firstname: String = "Peter", val lastname: String = "Parker") {

    var nickName: String? = null
        set(value){
            field = value
            println("the new nickname is $value")
        }
        get(){
            println("the returned value is $field")
            return field
        }
    fun printInfo(){
        val nickNameToPrint = nickName ?: "no nickname"
        val lastName = ""
        println("$firstname ($nickNameToPrint) $lastName")
    }

}