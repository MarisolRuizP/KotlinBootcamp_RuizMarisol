package parte2

open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}
class Wood : BaseBuildingMaterial() {
    override val numberNeeded: Int = 4
}
class Brick : BaseBuildingMaterial() {
    override val numberNeeded: Int = 8
}
class Building<T : BaseBuildingMaterial>(val material: T) {
    val baseMaterialsNeeded: Int = 100
    val actualMaterialsNeeded: Int = baseMaterialsNeeded * material.numberNeeded
    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} required")
    }
}
fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("large building")
    }
}
fun main() {
    val woodBuilding = Building(Wood())
    woodBuilding.build()
    isSmallBuilding(woodBuilding)
    val brickBuilding = Building(Brick())
    brickBuilding.build()
    isSmallBuilding(brickBuilding)
}
