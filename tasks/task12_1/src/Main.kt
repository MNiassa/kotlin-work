// Task 12.1: program that uses a Point object

fun main() {
    val p = Point(6.0, 9.0)
    println(p.x)
    println(p.y)

    val fromOrigin = p.distance()
    println(fromOrigin)

    val newPoint = Point(4.5, 7.0)
    val fromPoint = p.distanceTo(newPoint)
    println(fromPoint)
}
