import java.util.Arrays;

public class ProductArraySolution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return result;
    }

    static public void main(String[] args) {

        ProductArraySolution product = new ProductArraySolution();
        int[] array = {1, 2, 3, 4};
        int[] result = product.productExceptSelf(array);

        System.out.println("Result = " + Arrays.toString(result));

    }
}
