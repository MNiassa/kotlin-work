// Task 15.2.3: demo program

fun main() {
    val account = SavingsAccount("Neymar", 1.8)

    account.deposit(1250)

    repeat(5) {
        account.applyInterest()
    }

    account.withdraw(50)

    println("Final balance of the account is: £${account.balance}")
}
