package com.company.core.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class hashMap {

    public static void main(String[] args) {
        // HashMap and HashTables
        HashMap<String, String> hashMap = new HashMap<>();
        Hashtable<String, String> hashTable = new Hashtable<>();

        hashMap.put("key1","1val");
        hashMap.put("key2","2val");
        hashMap.put(null,null);
        long t = System.currentTimeMillis();
        for (Map.Entry<String, String> entry: hashMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println(System.currentTimeMillis() - t + " milliseconds");

        hashTable.put("key1", "1val");
        hashTable.put("key2", "2val");
        long time = System.currentTimeMillis();
        for (Map.Entry<String, String> entry: hashTable.entrySet()) {
            System.out.println(entry);
        }
        System.out.println(System.currentTimeMillis() - time + " milliseconds");

    }
}
