class Unit {
    var name: String = ""
    var power: Float = 0.0f
    var hp: Float = 0.0f
    var mp: Float = 0.0f
        set(value) {
            field = value
            isMpEnabled = value != 0.0f
        }
    var isMpEnabled: Boolean = false
    var location:CGPoint = CGPoint(0.0f, 0.0f)

    fun printAllProperties(){
        println("name : $name, power : $power, hp : $hp, mp: $mp, isMpEnabled : $isMpEnabled, location : (${location.x},${location.y})")
    }
}
