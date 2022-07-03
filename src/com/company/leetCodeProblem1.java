package com.company;

import java.util.HashMap;
import java.util.Map;

public class leetCodeProblem1 {
    public static void main(String[] args) {
        String str[] = {"ab", "abc", "ab", "cb"};
        String queries[] = {"ab","cb","a"};
        Map<String,Integer> stringMap = new HashMap<String, Integer>();
        for (String value:queries) {
            for (String element:str) {
                if(value == element){
                    if(stringMap.containsKey(value))
                        stringMap.put(value, stringMap.get(value)+1);
                    else
                        stringMap.put(value,1);
                }
            }
        }
        int result[] = new int[stringMap.keySet().size()];
        int i = 0;
        for (String key: stringMap.keySet()) {
            result[i] = stringMap.get(key);
            i++;
        }
        for (int j=0;  j< result.length ;j++) {
            System.out.print(result[j]+" ");
        }
    }
}
