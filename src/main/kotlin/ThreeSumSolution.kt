class ThreeSumSolution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = mutableListOf<List<Int>>()
        for (i in nums.indices) {
            if (i > 0 && nums[i] == nums[i - 1]) continue //Avoid repetitive results
            var pointerLeft = i + 1
            var pointerRight = nums.size - 1
            while (pointerLeft < pointerRight) {
                if (pointerLeft == i) {
                    pointerLeft++
                }
                if (pointerRight == i) {
                    pointerRight--
                }
                //x+y+z = 0 -> x+y = -z
                val x = nums[pointerLeft]
                val y = nums[pointerRight]
                val z = nums[i]
                val sum = x + y
                if (sum == -z) {
                    //save result
                    val currentResult = arrayListOf(x, y, z)

                    result.add(currentResult)

                    pointerRight--
                    pointerLeft++
                    //Avoid repetitive results
                    while (pointerLeft < pointerRight && nums[pointerLeft] == nums[pointerLeft - 1]) pointerLeft++
                    while (pointerLeft < pointerRight && nums[pointerRight] == nums[pointerRight + 1]) pointerRight--
                } else {
                    if (sum < -z) {
                        pointerLeft++

                    } else {
                        pointerRight--
                    }
                }
            }
        }
        return result
    }
}

fun main() {
    val array = intArrayOf(-1,0,1,2,-1,-4)
    val result = ThreeSumSolution().threeSum(array)

    println("Result = $result")
}
