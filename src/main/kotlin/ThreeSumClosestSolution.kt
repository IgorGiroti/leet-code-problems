import kotlin.math.abs

class ThreeSumClosestSolution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        //sort
        nums.sort()
        //two pointers solution
        val results = mutableMapOf<Int,Int>()
        var lastMinorDiff = Int.MAX_VALUE
        for(x in nums.indices){

            var pl = x+1 //pointer left
            var pr = nums.size-1 //pointer right
            while(pl < pr){
                val sum = nums[x] + nums[pl] + nums[pr]
                val diff= abs(sum - target)//always keep positive number

                if(diff == 0){
                    return sum
                }else if(diff < lastMinorDiff){
                    lastMinorDiff = diff
                    results[lastMinorDiff] = sum
                }

                if(sum < target){
                    pl++
                }else{
                    pr--
                }
            }
        }

        return results[lastMinorDiff]!!
    }
}
fun main() {
    val array = intArrayOf(-1,2,1,-4)
    val result = ThreeSumClosestSolution().threeSumClosest(array,1)

    println("Result = $result")
}
