// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("3 numbers required")
        exitProcess(1)
    }
    var initialTemp = args[0].toDouble()
    val maxTemp = args[1].toDouble()
    val increment = args[2].toDouble()

    while (initialTemp < maxTemp) {
        val fahrenheit = (initialTemp * 9)/5 + 32
        println("%5.1f %6.3f".format(initialTemp, fahrenheit))
        initialTemp += increment
    }
}
