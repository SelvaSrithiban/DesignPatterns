package stacks;

import java.util.Stack;

public class LargestRectangleHistogram {

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
            ans[i] = stack.peek(); // Previous smaller element value
        }

        stack.push(i); // Push index
    }

    return ans;
    }

    public int[] nextSmaller(int[] A) {
    if (A == null || A.length == 0) {
        return new int[0];
    }

    int n = A.length;
    int[] ans = new int[n];
    Stack<Integer> stack = new Stack<>(); // store indices

    for (int i = n - 1; i >= 0; i--) {
        while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            ans[i] = n;
        } else {
            ans[i] = stack.peek();
        }

        stack.push(i);
    }

    return ans;
}
    public int largestRectangleArea(int[] A) {

        if (A == null || A.length == 0) {
            return 0;
        }

        int n = A.length;

        if(n == 1){
            return A[0];
        }
        int[] ps = prevSmaller(A);
        int[] ns = nextSmaller(A);

        int max = 0;

        for (int i = 0; i < n; i++) {
            int width = ns[i] - ps[i] - 1;
            int area = A[i] * width;
            max = Math.max(max, area);
        }

        return max;
    
    }

}
