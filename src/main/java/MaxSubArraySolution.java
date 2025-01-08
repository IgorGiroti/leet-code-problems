public class MaxSubArraySolution {
    public int maxSubArray(int[] nums) {
        int total = 0;
        int result = Integer.MIN_VALUE;

        for (int i = 0; i <= nums.length - 1; i++) {
            if(total < 0){
                total = 0; //Reset if is negative because we want the positive numbers to get the maximum sum
            }
            total += nums[i]; //Add number to sum
            if (total > result) {
                result = total;
            }
        }
        return result;
    }


    static public void main(String[] args) {

        MaxSubArraySolution maxSubArraySolution = new MaxSubArraySolution();
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArraySolution.maxSubArray(array);

        System.out.println("Result = " + result);
    }
}




