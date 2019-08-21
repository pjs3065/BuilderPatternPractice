interface PropertiesBuilder {
    val unit: Unit

    fun buildUnit():PropertiesBuilder
    fun buildName(name:String): PropertiesBuilder
    fun buildPower(power:Float): PropertiesBuilder
    fun buildHp(hp:Float): PropertiesBuilder
    fun buildMp(mp:Float): PropertiesBuilder
    fun buildLocation(location:CGPoint): PropertiesBuilder
}