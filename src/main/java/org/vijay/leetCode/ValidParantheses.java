package org.vijay.leetCode;

import java.util.Stack;

public class ValidParantheses {

    public static void main(String[] args) {
        boolean result = isValid("]");
        System.out.println(result);
    }

    public static boolean isValid(String s) {

        Stack <String> paranthesesStack = new Stack <> ();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            String element = String.valueOf(c);
            if (element.equals("(") || element.equals("[") || element.equals("{")) {
                paranthesesStack.push(element);
            } else if (!paranthesesStack.isEmpty() &&
                    ((element.equals(")") && paranthesesStack.peek().equals("(")) ||
                            (element.equals("]") && paranthesesStack.peek().equals("[")) ||
                            (element.equals("}") && paranthesesStack.peek().equals("{")))
            ) {
                paranthesesStack.pop();
            } else {
                return false;
            }
        }
        return paranthesesStack.isEmpty();
    }
}
