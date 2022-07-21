package com.company.leetCode;

public class sumOfTwo {
        public static int[] twoSum(int[] nums, int target) {
            int sum = 0;
            int[] arr = new int[2];

            for(int i = 0; i < nums.length-1; i++){
                for(int j = i+1; j <= nums.length-1; j++){
                    sum = nums[i] + nums[j];
                    if(sum == target){
                        arr[0] = i;
                        arr[1] = j;
                    }
                }
            }
            return arr;
        }

    public static void main(String[] args) {
        int[] arr = {2,4};
        int[] res = twoSum(arr,6);
        for (int a: res) {
            System.out.print(a+" ");
        }

    }
}
