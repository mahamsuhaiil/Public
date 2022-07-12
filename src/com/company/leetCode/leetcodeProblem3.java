package com.company.leetCode;

public class leetcodeProblem3 {
    public static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

        public static int[] productExceptSelf(int[] nums) {
            int[] left = new int[nums.length];
            int[] right = new int[nums.length];
            int[] answers = new int[nums.length];
            int temp = nums.length-1;
            for(int i=1; i < nums.length; i++) {
                left[0] = 1;
                right[nums.length-1] = 1;
                left[i] = left[i-1] * nums[i-1];
                right[(nums.length-1)-i] = nums[temp] * right[temp];
                temp--;
            }
            for(int j = 0; j < nums.length; j++){
                answers[j] = left[j] * right[j];
            }
            return answers;
        }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] number = {1,2,3,4};
        System.out.println(maxProfit(prices));
        for (int a: productExceptSelf(number)) {
            System.out.print(a+" ");

        }
    }
}
