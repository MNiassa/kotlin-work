import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        rollDie()
    }
    println(rollDie(args[0].toInt()))
}