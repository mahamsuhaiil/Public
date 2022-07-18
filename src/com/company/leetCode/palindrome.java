package com.company.leetCode;
// 9. Palindrome number
/*
    Given an integer x, return true if x is palindrome integer.
    An integer is a palindrome when it reads the same backward as forward.
* */
public class palindrome {
    public static boolean isPalindrome(int x){
        int number = x;
        int reverse = 0;
        while(number > 0){
            reverse = (reverse * 10) + number % 10;
            number = number / 10;
        }
        if(reverse == x){
            return true;
        }
        else
            return false;

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(-125));
    }
}
