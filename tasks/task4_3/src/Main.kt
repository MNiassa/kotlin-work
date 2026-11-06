// Task 4.3: grade calculation using a when expression

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Please make sure to provide 3 marks")
        exitProcess(1)
    }
    val averageMark = (args[0].toInt() + args[1].toInt() + args[2].toInt())/3
    val grade = when (averageMark) {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "?"
    }
    println("$averageMark $grade")
}