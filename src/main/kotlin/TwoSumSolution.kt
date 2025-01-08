class TwoSumSolutionKotlin {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        //Map solution
        val visited = mutableMapOf<Int,Int>()

        nums.forEachIndexed{index, value ->
            val complement = target - value
            if(visited.contains(complement)){
                return intArrayOf(visited[complement]!!,index)
            }else{
                visited[value] = index
            }
        }
        throw Exception("Not Found")
    }
}

fun main() {
    val array = intArrayOf(2,7,11,15)
    val result = TwoSumSolutionKotlin().twoSum(array,9)

    println("Result = $result")
}