// Comp2850 portfolio task: Week 5

package comp2850.banking

const val MAX_OVERDRAFT = 100

class StudentAccount(holder: String) : BankAccount(holder) {
    var overdraft: Int = 0
        set(value) {
            require(value in 0..MAX_OVERDRAFT) {
                "Overdraft must be between 0 and $MAX_OVERDRAFT"
            }
            field = value
        }

    fun withdrawalsAllowed(): Boolean = balance + overdraft > 0

    override fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be greater than 0" }
        require(amount <= balance + overdraft) { "Insufficient funds for withdrawal" }
        balance -= amount
    }

    override fun toString() = "Account for $holder, balance = $balance (overdraft = $overdraft)"
}