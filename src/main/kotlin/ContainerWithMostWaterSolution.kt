class ContainerWithMostWaterSolution {
    fun maxArea(height: IntArray): Int {
        var pointerLeft = 0
        var pointerRight = height.size-1
        var currentMaxArea = Int.MIN_VALUE

        while(pointerLeft < pointerRight){
            val leftY = height[pointerLeft]
            val rightY = height[pointerRight]

            var calculatedArea: Int

            if(leftY >= rightY){
                calculatedArea = rightY*(pointerRight - pointerLeft)
                pointerRight--

            }else{
                calculatedArea = leftY*(pointerRight - pointerLeft)
                pointerLeft++
            }

            if(calculatedArea >currentMaxArea ){
                currentMaxArea = calculatedArea
            }
        }

        return currentMaxArea
    }
}

fun main() {
    val array = intArrayOf(1,8,6,2,5,4,8,3,7)
    val result = ContainerWithMostWaterSolution().maxArea(array)

    println("Result = $result")
}