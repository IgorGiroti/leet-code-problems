class MaxProfitSolutionKotlin {
    fun maxProfit(prices: IntArray): Int {
        var lowestPrice = Int.MAX_VALUE
        var profit = 0
        prices.forEach { value ->
            if (value < lowestPrice) {
                lowestPrice = value
            } else {
                val currentProfit = value - lowestPrice
                if (currentProfit > profit) {
                    profit = currentProfit
                }
            }
        }
        return profit
    }
}

fun main() {
    val array = intArrayOf(7,1,5,3,6,4)
    val result = MaxProfitSolutionKotlin().maxProfit(array)

    println("Result = $result")
}