fun main(args: Array<String>) {
    val unitBuilder = UnitBuilder()
    val barrack = Barrack()

    val margin = barrack.createMarine(unitBuilder)
    val fireBat = barrack.createFireBat(unitBuilder)
    val ghost = barrack.createGhost(unitBuilder)

    margin.printAllProperties()
    fireBat.printAllProperties()
    ghost.printAllProperties()
}