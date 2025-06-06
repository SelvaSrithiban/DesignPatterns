package stacks;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression {

    public int evalRPN(ArrayList < String > A) {
        Stack < Integer > values = new Stack < Integer > ();
        int first;
        int second;
        for (String str: A) {
            // on encountering an operator, pop the top two elements from the stack, 
            // perform the operation and push that back into the stack
            if (equal(str, "+")) {
                second = values.pop();
                first = values.pop();
                values.push(first + second);
            } else if (equal(str, "*")) {
                second = values.pop();
                first = values.pop();
                values.push(first * second);
            } else if (equal(str, "/")) {
                second = values.pop();
                first = values.pop();
                values.push(first / second);
            } else if (equal(str, "-")) {
                second = values.pop();
                first = values.pop();
                values.push(first - second);
            } else {
                first = Integer.parseInt(str);
                values.push(first);
            }
        }
        return values.peek();
    }
    public boolean equal(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

}
