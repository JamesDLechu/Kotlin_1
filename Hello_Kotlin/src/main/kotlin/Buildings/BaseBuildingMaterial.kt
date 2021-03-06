package Buildings

open class BaseBuildingMaterial(var numberNeeded:Int = 1)

class Wood: BaseBuildingMaterial(4)

class Brick: BaseBuildingMaterial(8)

class Building<T: BaseBuildingMaterial>(val actualMaterialsNeeded: T){
    val baseMaterialsNeeded:Int = 100
    fun build(){
        println("To build this is needed ${actualMaterialsNeeded::class.simpleName} and are required an amount of ${baseMaterialsNeeded * actualMaterialsNeeded.numberNeeded}")
    }
}

fun <T: BaseBuildingMaterial> isSmallBuilding(myBuilding: Building<T>) {
    if ((myBuilding.actualMaterialsNeeded.numberNeeded * myBuilding.baseMaterialsNeeded) < 500) {
        println("Small building")
    }else {
        println("Large building")
    }
}

