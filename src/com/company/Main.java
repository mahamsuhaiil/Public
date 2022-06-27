package com.company;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
       /*
        String string = new String("string");
        StringBuilder stringBuilder = new StringBuilder("builder");
        StringBuffer stringBuffer = new StringBuffer("buffer");
        string.concat(" conact"); // it will return new string -> 'string concat'
        stringBuilder.append(" appending"); // it will just append new string with original -> 'builder appending'
        stringBuffer.append(" appending"); // it will just append new string with original -> 'buffer appending'

        System.out.println(string);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
        */

        //performance comparison b/w string buffer and string builder
        /*StringBuilder stringBuilder = new StringBuilder("builder");
        long t = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            stringBuilder.append("appending");
            System.out.println(stringBuilder);
        }
        long execTime = System.currentTimeMillis() - t;
        System.out.println("builder time----------------->"+execTime+" millisecond");*/

        // stringBuffer
    /*    StringBuffer stringBuffer = new StringBuffer("buffer");
        long timeMillis = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            stringBuffer.append("appending");
            System.out.println(stringBuffer);
        }
        long time = System.currentTimeMillis() - timeMillis;
        System.out.println("buffer time----------------->"+time+" millisecond"); */

        // equals vs ' =='
        /*String str1 = new String("Hello");
        String str2 = new String("Hello");
        if(str1 == str2){
            System.out.println("compared");
        }
        else{
            System.out.println("Can not compare objects through '=='");
        }
        if (str1.equals(str2)){
            System.out.println("Compared Strings object values successfully");
        }
        else {
            System.out.println("Can not compare strings with this.");
        }*/
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
