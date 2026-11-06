// Task 4.2: use of if and ranges

fun main() {
    println("Please select your choice of pizza from the following: a, b, c, d")
    val choice = readln().lowercase()
    if (choice[0] in 'a'..'d' && choice.length == 1) {
        println("Order accepted")
    } else {
        println("Invalid choice!")
    }
}
