class Barrack {
    fun createMarine(builder: PropertiesBuilder) : Unit{
        val margin = builder
            .buildUnit()
            .buildHp(40f)
            .buildMp(0f)
            .buildName("Marine")
            .buildPower(6f)
            .buildLocation(CGPoint(40f,40f))
        return margin.unit
    }

    fun createFireBat(builder: PropertiesBuilder) : Unit{
        val fireBat = builder
            .buildUnit()
            .buildHp(40f)
            .buildMp(50f)
            .buildName("FireBat")
            .buildPower(8f)
            .buildLocation(CGPoint(60f,30f))
        return fireBat.unit
    }

    fun createGhost(builder: PropertiesBuilder) : Unit{
        val ghost = builder
            .buildUnit()
            .buildHp(40f)
            .buildMp(100f)
            .buildName("Ghost")
            .buildPower(10f)
            .buildLocation(CGPoint(30f,60f))
        return ghost.unit
    }
}