package parte2.Buildings

open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}
class Wood : BaseBuildingMaterial() {
    override val numberNeeded: Int = 4
}
class Brick : BaseBuildingMaterial() {
    override val numberNeeded: Int = 8
}
class Building<out T : BaseBuildingMaterial>(private val material: T) {
    private val baseMaterialsNeeded: Int = 100
    private val actualMaterialsNeeded: Int = baseMaterialsNeeded * material.numberNeeded
    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} required")
    }
}
fun main() {
    val building = Building(Wood())
    building.build()
}
