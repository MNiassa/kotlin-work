// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(sides: Int = 6, numbDice: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        var total = 0
        for (n in 1..numbDice) {
            total += Random.nextInt(1, sides + 1)
        }
        println("Rolling $numbDice d$sides dices")
        println("You rolled a total of $total")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}
