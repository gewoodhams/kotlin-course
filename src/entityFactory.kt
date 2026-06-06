import java.util.*

enum class EntityType{
    HELP, EASY, MEDIUM, HARD
    fun getFormattedName() = name.toLowerCase().capitalize()

}


object EntityFactory{
    fun create(type: EntityType) : Entity{
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.HELP -> type.getFormattedName()
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "Hard"
        }
        return when(type){
            EntityType.EASY -> Easy(id, name)
            EntityType.MEDIUM -> Medium(id, name)
            EntityType.HARD -> Hard(id, name, multiplier: 2f)
            EntityType.HELP ->Entity.Help
        }
    }
}

sealed class Entity(){
    object Help: Entity(){
        val name = "Help"
    }
    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity()
}

fun main(){
    val entity = Entity.Factory.create()
    println(entity)

    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)
}