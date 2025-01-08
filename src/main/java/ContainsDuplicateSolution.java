import java.util.HashSet;

public class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> alreadySeen = new HashSet<>();

        for (int n : nums) {
            if (alreadySeen.contains(n)){
                return true;
            } else{
                alreadySeen.add(n);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ContainsDuplicateSolution containsDuplicateSolution = new ContainsDuplicateSolution();
        int[] array = {1, 2, 3, 1};

        boolean result = containsDuplicateSolution.containsDuplicate(array);


        System.out.println("Result = " + result);

    }
}
