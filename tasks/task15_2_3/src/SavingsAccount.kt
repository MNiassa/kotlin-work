// Task 15.2.3: SavingsAccount class

class SavingsAccount(holder: String, val rate: Double) : BankAccount(holder) {
    init {
        require(rate > 0) { "The innterest rate must be greater than 0, but was $rate" }
    }

    fun applyInterest() {
        val interest = (balance * rate / 100).toInt()
        if (interest > 0) {
            deposit(interest)
        }
    }
}