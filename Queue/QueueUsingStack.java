package Queue;

import java.util.Stack;

public class QueueUsingStack {
    public static Stack<Integer> st1 = new Stack<>();
    public static Stack<Integer> st2 = new Stack<>();

    public static int poll() {
        if (st1.isEmpty()) {
            return -1;
        }
        return st1.pop();
    }

    public static int top() {
        if (st1.isEmpty()) {
            return -1;
        }
        return st1.peek();
    }

    public static void push(int x) {
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        st1.push(x);
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }

    public static void main(String[] args) {

    }
}
