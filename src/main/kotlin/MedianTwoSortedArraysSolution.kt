class MedianTwoSortedArraysSolution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val mergedArray = nums1 + nums2
        mergedArray.sort() //sort again after merge

        //Strategy: Divide the array size to find the middle

        val isEven = mergedArray.size % 2 == 0
        val middleIndex = (mergedArray.size)/2
        return if(isEven){
            ((mergedArray[middleIndex -1].toDouble() + mergedArray[middleIndex].toDouble())/2)
        }else{
            mergedArray[middleIndex].toDouble()
        }
    }
}

fun main() {
    val array = intArrayOf(1,3)
    val array2 = intArrayOf(2)
    val result = MedianTwoSortedArraysSolution().findMedianSortedArrays(array,array2)

    println("Result = $result")
}