var name = "Nate"
var greeting: String? = null

fun variables(){
    val greetingToPrint = if(greeting != null) greeting else "Hi"
    println(greetingToPrint)
    println(name)
}