import java.util.Arrays;
import java.util.HashMap;

public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> mapper = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i<= nums.length -1; i++){

            int complement = target - nums[i];
            if (mapper.containsKey(complement)){
                result[0] = mapper.get(complement);
                result[1] = i;
                return result;
            }

            mapper.put(nums[i],i);
        }

      throw new IllegalArgumentException("not found!");
    }



    public static void main(String[] args) {

        TwoSumSolution twoSun = new TwoSumSolution();
        int[] array = {2, 7, 3, 5};
        int[] result = twoSun.twoSum(array, 9);

        System.out.println("Result = " + Arrays.toString(result));
    }
}


