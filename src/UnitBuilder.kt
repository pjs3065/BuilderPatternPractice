class UnitBuilder : PropertiesBuilder {
    override var unit: Unit = Unit()

    override fun buildUnit(): PropertiesBuilder {
        unit = Unit()
        return this
    }

    override fun buildName(name: String): PropertiesBuilder {
        unit.name = name
        return this
    }

    override fun buildPower(power: Float): PropertiesBuilder {
        unit.power = power
        return this
    }

    override fun buildHp(hp: Float): PropertiesBuilder {
        unit.hp = hp
        return this
    }

    override fun buildMp(mp: Float): PropertiesBuilder {
        unit.mp = mp
        return this
    }

    override fun buildLocation(location: CGPoint): PropertiesBuilder {
        unit.location = location
        return this
    }
}