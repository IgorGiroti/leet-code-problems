public class MaxProfitSolution {
    public int maxProfitSolution(int[] prices) {

        int currentProfit = 0;
        int currentMinPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < currentMinPrice) {
                currentMinPrice = price;

            } else {
                int possibleProfit = price - currentMinPrice;
                if (possibleProfit > currentProfit) {
                    currentProfit = possibleProfit;
                }
            }
        }

        return currentProfit;
    }


    public static void main(String[] args) {

        MaxProfitSolution maxProfitSolution = new MaxProfitSolution();
        int[] array = {7, 1, 5, 3, 6, 4};
        int result = maxProfitSolution.maxProfitSolution(array);

        System.out.println("Result = " + result);

    }
}
