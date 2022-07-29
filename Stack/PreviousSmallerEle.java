package Stack;

import java.util.Stack;

public class PreviousSmallerEle {
    public static void previousSmallerElement(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty()) {
                if (st.peek() < arr[i]) {
                    res[i] = st.peek();
                    break;
                } else {
                    st.pop();
                }
            }
            if (st.isEmpty()) {
                res[i] = -1;
            }
            st.add(arr[i]);
        }

        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 10, 5, 8, 20, 15, 3, 12 };

        previousSmallerElement(arr);
    }
}
