class ProductArraySolutionKotlin {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n)

        var leftProduct = 1
        for (i in nums.indices) {
            result[i] = leftProduct
            leftProduct *= nums[i]
            println(result[i])
        }

        var rightProduct = 1
        for (i in nums.indices.reversed()) {
            result[i] *= rightProduct
            rightProduct *= nums[i]
            println(result[i])
        }

        return result
    }
}

fun main() {
    val array = intArrayOf(1,2,3,4)
    val result = ProductArraySolutionKotlin().productExceptSelf(array)

    println("Result = $result")
}