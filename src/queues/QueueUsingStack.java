package queues;

import java.util.Stack;

public class QueueUsingStack {


    static Stack<Integer> st1;
    static Stack<Integer> st2;
    /** Initialize your data structure here. */
    QueueUsingStack() {
        st1 = new Stack<Integer>();
        st2 = new Stack<Integer>();
    }
    
    /** Push element X to the back of queue. */
    static void push(int X) {
        //push the element to st1
        st1.push(X);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    static int pop() {
        //check if st2 is empty
        if(st2.empty()){
            while(!st1.empty()){
                int tmp = st1.pop();
                st2.push(tmp);
            }
        }
    return st2.pop();    
    }
    
    /** Get the front element of the queue. */
    static int peek() {
        //check if st2 is empty
        if(st2.empty()){
            while(!st1.empty()){
                int tmp = st1.pop();
                st2.push(tmp);
            }
        }
    return st2.peek();  
        
    }
    
    /** Returns whether the queue is empty. */
    static boolean empty() {
        if(st1.empty() && st2.empty()){
            return true;
        }
    return false;    
    }

}
