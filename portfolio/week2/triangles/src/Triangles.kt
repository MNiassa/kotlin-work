// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(sides: Triangle): Boolean {
    val (a, b, c) = sides
    return a > 0 && b > 0 && c > 0 &&
            a + b > c &&
            b + c > a &&
            a + c > b
}

fun triangleArea(sides: Triangle): Double {
    val (a, b, c) = sides
    val s = (a + b + c) / 2
    val area = sqrt(s*(s-a)*(s-b)*(s-c))
    return area
}
