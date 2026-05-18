fun sayHello2(greeting:String, itemsToGreet:List<String>){
    itemsToGreet.forEach{ itemToGreet ->
        println("$greeting $itemToGreet")
    }
}


fun Collections(){
    val interestingThings = mutableListOf("Kotlin","Java","Python","Python")

    sayHello2("Hi", interestingThings)
}