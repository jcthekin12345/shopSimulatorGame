class Bank {
    private var balance: Double = 0.0
    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        balance -= amount
    }
    fun getBalance(): Double {
        return balance
    }

}