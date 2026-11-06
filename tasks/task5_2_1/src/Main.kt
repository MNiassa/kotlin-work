// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please provide a circle radius")
        exitProcess(1)
    }
    var area = circleArea(args[0].toDouble())
    var perimeter = circlePerimeter(args[0].toDouble())
    println("Area = $area , Perimeter = $perimeter")
}