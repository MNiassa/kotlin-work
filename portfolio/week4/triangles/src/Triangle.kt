// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {

    init {
        require(
            sideA > 0 && sideB > 0 && sideC > 0 &&
                    sideA + sideB > sideC &&
                    sideB + sideC > sideA &&
                    sideA + sideC > sideB
        ) {
            "This is an invalid triangle: ($sideA, $sideB, $sideC), please provide a valid traingle"
        }
    }

    val perimeter: Double
        get() = sideA + sideB + sideC

    val semiPerimeter: Double
        get() = perimeter / 2

    val area: Double
        get() {
            val s = semiPerimeter
            return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
        }

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}