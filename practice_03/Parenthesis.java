package practice_03;

import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        if(A == null || A.length() != n) {
            return false;
        }
        for(int i = 0;i < n;i++) {
            if(A.charAt(i) == '(') {
                stack.push(A.charAt(i));
            }else if(A.charAt(i) == ')') {
                if(stack.empty()) {
                    return false;
                }else {
                    stack.pop();
                }
            }else {
                return false;
            }
        }
        if(!stack.empty()){
            return false;
        }else {
            return true;
        }
    }
}