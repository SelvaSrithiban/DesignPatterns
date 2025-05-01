package stacks;

import java.util.Stack;

public class NearestSmallerElement {

    public int[] prevSmaller(int[] A) {

        if (A == null || A.length == 0) {
        return new int[0];
    }

    int n = A.length;
    int[] ans = new int[n];
    Stack<Integer> stack = new Stack<>(); // store indices

    for (int i = 0; i < n; i++) {
        while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            ans[i] = -1;
        } else {
            ans[i] = A[stack.peek()]; // Previous smaller element value
        }

        stack.push(i); // Push index
    }

    return ans;
    }

}
