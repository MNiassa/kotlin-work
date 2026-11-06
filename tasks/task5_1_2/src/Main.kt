// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please provide an even number between 4 and 20")
        exitProcess(1)
    }
    println(rollDie(args[0].toInt()))
}