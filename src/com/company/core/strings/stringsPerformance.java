package com.company.core.strings;

public class stringsPerformance {
    public static void main(String[] args) {
        //performance comparison b/w string buffer and string builder
        StringBuilder stringBuilder = new StringBuilder("builder");
        long t = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            stringBuilder.append("appending");
            System.out.println(stringBuilder);
        }
        long execTime = System.currentTimeMillis() - t;
        System.out.println("builder time----------------->"+execTime+" millisecond");

        // stringBuffer
        StringBuffer stringBuffer = new StringBuffer("buffer");
        long timeMillis = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            stringBuffer.append("appending");
            System.out.println(stringBuffer);
        }
        long time = System.currentTimeMillis() - timeMillis;
        System.out.println("buffer time----------------->"+time+" millisecond");
    }
}
