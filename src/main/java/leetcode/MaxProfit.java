package leetcode;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int total = 0;
        for (int i=0; i< prices.length-1; i++) {
            if (prices[i+1]>prices[i]) total += prices[i+1]-prices[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] parameter = {5,4,9,5};
        System.out.println("The maximum profit is " + maxProfit(parameter));
    }
}
