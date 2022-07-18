package com.company.leetCode;

import java.util.HashMap;
import java.util.Map;

public class numeralsToRoman {
    static class Map{
        String symbol;
        int value;
        public Map(String symbol, int value) {
            this.symbol = symbol;
            this.value = value;
        }
    }
    public static String getRoman(int number) {
        Map[] maps = {
                new Map("M", 1000),
                new Map("CM", 900),
                new Map("D", 500),
                new Map("CD", 400),
                new Map("C", 100),
                new Map("XC", 90),
                new Map("L", 50),
                new Map("XL", 40),
                new Map("X", 10),
                new Map("IX", 9),
                new Map("V", 5),
                new Map("IV", 4),
                new Map("I", 1)
        };
        int modulus = number;
        String roman = "";
        int count = 0;
        for (Map map: maps) {
            if(number/map.value != 0 ){
                count = number / map.value;
                    if (count != 0) {
                        roman += map.symbol.repeat(count);
                    number = number % map.value;
                }
            }
        }

        return roman;
    }
    public static void main(String[] args) {
        System.out.println(getRoman(737));
    }
}
