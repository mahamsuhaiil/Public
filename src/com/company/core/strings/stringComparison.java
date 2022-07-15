package com.company.core.strings;

public class stringComparison {
    public static void main(String[] args) {
        // equals vs ' =='
        String str1 = new String("Hello");
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
        }
    }
}
