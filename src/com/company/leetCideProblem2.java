package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// didn't handle exceptional cases yet

public class leetCideProblem2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String,Integer>();
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter roman number: ");
        String roman = sc.next();
        int[] temp;
        int value = 0;
        if(map.containsKey(roman.toUpperCase()))
            value = map.get(roman.toUpperCase()).intValue();
        if(value != 0)
            System.out.println("Number is: "+value);
        else
            for(int i = roman.length()-1; i > 0; i--){
                int rm1 = map.get(Character.toString(roman.toCharArray()[i]).toUpperCase());
                int rm2 = map.get(Character.toString(roman.toCharArray()[i-1]).toUpperCase());
                if(rm1 > rm2){
                    if(value == 0)
                        value = rm1 - rm2;
                    else
                        value = value + rm2;
                }
                if(rm1 < rm2 || rm1 == rm2){
                    if(value == 0)
                        value = rm1 + rm2;
                    else
                        value = value + rm2;
                }
            }
                 System.out.println(value);
    }
}
