package parte1

fun main(args: Array<String>) {
    val rollDice1 = { (1..12).random() }
    println(rollDice1)
    //---------------------------------------
    val rollDice2 = { sides: Int ->
        (1..sides).random()
    }
    println(rollDice2(24))
    //---------------------------------------
    val rollDice3 = { sides: Int ->
        if (sides == 0) 0 else (1..sides).random()
    }
    println(rollDice3(0))
    //---------------------------------------
    val rollDice4: (Int) -> Int = { sides ->
        if (sides == 0) 0 else (1..sides).random()
    }
    println(rollDice4(12))
    //----------------------------------------------------------------------
    gamePlay(rollDice4)
    gamePlay(rollDice4)
    gamePlay(rollDice4)
}

fun gamePlay(roll: (Int) -> Int) {
    val result = roll(12)
    println("Dice rolled: $result")
}
