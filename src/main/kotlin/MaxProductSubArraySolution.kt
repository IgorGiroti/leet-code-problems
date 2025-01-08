class MaxProductSubArraySolution {
    fun maxProduct(nums: IntArray): Int {
        var currentMax = 1
        var currentMin = 1
        var result = Int.MIN_VALUE

        nums.forEach{ value->
            if(value < 0){
                val stepMax = currentMax
                currentMax = currentMin
                currentMin = stepMax
            }

            currentMax *= value
            currentMin *= value

            if(value > currentMax){
                currentMax = value
            }else if(value < currentMin){
                currentMin = value
            }

            if(currentMax > result){
                result = currentMax
            }
        }

        return result
    }
}

fun main() {
    val array = intArrayOf(2,3,-2,4)
    val result = MaxProductSubArraySolution().maxProduct(array)

    println("Result = $result")
}