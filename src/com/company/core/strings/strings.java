package com.company.core.strings;

public class strings {
    public static void main(String[] args) {
        String string = new String("string");
        StringBuilder stringBuilder = new StringBuilder("builder");
        StringBuffer stringBuffer = new StringBuffer("buffer");
        string.concat(" conact"); // it will return new string -> 'string concat'
        stringBuilder.append(" appending"); // it will just append new string with original -> 'builder appending'
        stringBuffer.append(" appending"); // it will just append new string with original -> 'buffer appending'

        System.out.println(string);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
    }
}
