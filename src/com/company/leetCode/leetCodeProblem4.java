package com.company.leetCode;



public class leetCodeProblem4 {
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length;i++){
            sum = sum + nums[i];
            nums[i] = sum; 
        }
        return nums;
    }
    public static void main(String[] args) {
       /* int[] nums = {1,2,3,4};
        for (int a: runningSum(nums)) {
            System.out.print(a+" ");

        }*/
        
        int i =100;
        i = i++ + ++i;
        System.out.println(i);

    }
}
