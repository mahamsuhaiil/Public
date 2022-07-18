package com.company.leetCode;
/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".*/

public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] words) {
        int counter = 0;

        external:
        for (int i = 0; i < words[0].length(); i++) {

            // Get letter from first word
            char letter = words[0].charAt(i);

            // Check rest of the words on that same positions
            for (int j = 1; j < words.length; j++) {
                // Break when word is shorter or letter is different
                if (words[j].length() <= i || letter != words[j].charAt(i)) {
                    break external;
                }
            }

            // Increase counter, because all of words
            // has the same letter (e.g. "E") on the same position (e.g. position "5")
            counter++;
        }

        // Return proper substring
        return words[0].substring(0, counter);
    }

    public static void main(String[] args) {
        String[] str = {"flow","flower","flight"};
        System.out.println(longestCommonPrefix(str));
    }

}
