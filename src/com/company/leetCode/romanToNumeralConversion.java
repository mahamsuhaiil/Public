package com.company.leetCode;

import java.util.HashMap;
import java.util.Map;

public class romanToNumeralConversion {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        String str = "MCMXCIV";
        char[] s = (str).toCharArray();
        int number = 0;
        int n = str.length();
        for(int i=0;i<str.length()-1;i++){
            if(map.get(s[i+1]) <= map.get(s[i])){
                number += map.get(s[i]);
            }
            else{
                number -= map.get(s[i]);
            }
        }
        number = number + map.get(s[str.length()-1]);
        System.out.println(number);
    }
}
