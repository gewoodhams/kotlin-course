fun sayHello4(greeting:String, vararg itemsToGreet:String){
    itemsToGreet.forEach{ itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun greetPerson2(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main(){
    val person = Person("Nate", "Ebel")
    person.lastname
    person.firstname
    person.nickName
}