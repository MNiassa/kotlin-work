// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(input: String, redactedText: String, redactionChar: Char = 'X'): String {
    return input.replace(redactedText, redactionChar.toString().repeat(redactedText.length))
}

