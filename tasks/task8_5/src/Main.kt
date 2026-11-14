// Task 8.5: example of using a higher-order function

fun main() {
    val text = "The cat sat on the mat."

    val vowelCount = text.howMany {it.lowercase() in "aeiou"}
    println("$vowelCount vowels found")

    val upperCase = text.howMany {it.isUpperCase()}
    println("$upperCase upper case letters found")

    val lowerCase = text.howMany {it.isLowerCase()}
    println("$lowerCase lower case letters found")
}
