class FancyInfoProvider : BasicInfoProvider() {

    override val sessionIdPrefix: String
        get() = super.sessionIdPrefix

    override val providerInfo: String
        get() = "Fancy Info Provider"

    override fun printInfo(person: Person){
        super.printInfo(person)
        println("Fancy Info")
    }

}