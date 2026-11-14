// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Please provide path to CSV file")
        exitProcess(1)
    }

    val records = fetchData(args[0])

    val lowest = records.minBy {it.second}
    val highest = records.maxBy {it.second}

    println("Lowest: ${lowest.first} (${lowest.second})")
    println("Highest: ${highest.first} (${highest.second})")

    val average = averageTemp(records)
    println("$average")
}
