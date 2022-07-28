package common

class RichestCustomerWealth {

    fun maximumWealth(accounts: Array<IntArray>): Int {
        val customerLength = accounts.size
        var wealthOfRichCustomer = -1
        for (i in 0 until customerLength) {
            val bankLength = accounts[i].size
            var sum = 0
            for (j in 0 until bankLength) {
                sum += accounts[i][j]
            }
            if (sum > wealthOfRichCustomer) {
                wealthOfRichCustomer = sum
            }
        }
        return wealthOfRichCustomer
    }
}