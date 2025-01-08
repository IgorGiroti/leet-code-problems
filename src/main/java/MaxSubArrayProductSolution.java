public class MaxSubArrayProductSolution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int maxProduct = nums[0];
        int minProduct = nums[0];

        for (int i = 1; i <= nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }


            maxProduct = Math.max(maxProduct * nums[i], nums[i]);
            minProduct = Math.min(minProduct * nums[i], nums[i]);


            result = Math.max(maxProduct, result);

        }

        return result;
    }


    static public void main(String[] args) {
        MaxSubArrayProductSolution maxSubArrayProductSolution = new MaxSubArrayProductSolution();
        int[] array = {2, -5, -2, -4, 3};
        int result = maxSubArrayProductSolution.maxProduct(array);

        System.out.println("Result = " + result);
    }
}




