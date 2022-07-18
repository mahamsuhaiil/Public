package com.company.leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidClosingParenthesis {
    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
            map.put('(',')');
            map.put('{','}');
            map.put('[',']');
            Stack<Character> st = new Stack<>();
            for(char c : s.toCharArray()){
                if(c== '(' || c=='{' || c=='['){
                    st.push(c);
                }else{
                    if(!st.isEmpty()){
                        char curr = st.peek();
                        if(map.containsKey(curr)){
                            st.pop();
                            if(map.get(curr) != c){
                                return false;
                            }
                        }


                    }
                }
            }
            return st.isEmpty();
        }
    public static void main(String[] args) {
        System.out.println(isValid("("));
    }
}
