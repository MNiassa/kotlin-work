// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }

    }
    // Write four more tests here
    "Median of 1 number is that number" {
        median(listOf(7.5f)) shouldBe (7.5f plusOrMinus tolerance)
    }

    "Median of 2 numbers is their mean" {
        median(listOf(9f, 3f)) shouldBe (6f plusOrMinus tolerance)
    }

    "Median of 3 unsorted numbers is the middle value after sorted" {
        median(listOf(9f, 1f, 2f)) shouldBe (2f plusOrMinus tolerance)
    }

    "Median of 4 unsorted numbers is the mean of the middle two after sorted" {
        median(listOf(10f, 1f, 4f, 2f)) shouldBe (3f plusOrMinus tolerance)
    }
})
