fun main() {
    val aquarium = 2.plus(71).plus(233).minus(13).div(30).plus(1)
    println(aquarium)
    //-----------------------
    var rainbowColor = "Blue"
    rainbowColor = "Green"
    val blackColor = "Black"
    //blackColor = "Yellow"
    //-----------------------
    //rainbowColor = null
    var greenColor = null
    var blueColor: String? = null
    //-----------------------
    listOf(null, null)
    var list: List<Int?> = listOf(null, null)
    var emptyList:List<String>? = null
    //-----------------------
    var nullTest: Int? = null
    println(nullTest?.inc() ?:0)
}