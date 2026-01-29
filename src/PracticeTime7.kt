fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    val curries = spices
        .filter { it.contains("curry") }
        .sortedBy { it.length }
    println(curries)
    //---------------------------------------------
    val spicesCE1 = spices.filter { it.startsWith('c') && it.endsWith('e') }
    println(spicesCE1)
    val spicesCE2 = spices
        .filter { it.startsWith('c') }
        .filter { it.endsWith('e') }
    println(spicesCE2)
    //---------------------------------------------
    val threeWithC = spices
        .take(3)
        .filter { it.startsWith('c') }
    println(threeWithC)
}