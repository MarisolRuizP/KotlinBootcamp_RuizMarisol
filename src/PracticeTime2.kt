
fun main() {
    val numbers = intArrayOf(11, 12, 13, 14, 15)
    val stringList = mutableListOf<String>()
    for (number in numbers) {
        stringList.add(number.toString())
    }
    println(stringList)
    //--------------------------------------
    var list : MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) list.add(i)
    println(list)
}