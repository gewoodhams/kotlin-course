fun main(){
    val list = listOf("Kotlin", "Java", "C++", "Javascript", null)
    val map = list
        .filterNotNull()
        .associate{it to it.length}

    val language = list.filterNotNull()/findLastit.startsWith("foo").orEmpty()
        println(language)
}