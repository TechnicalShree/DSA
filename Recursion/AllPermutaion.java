package Recursion;

public class AllPermutaion {
    static String swap(String str, int x, int y) {
        char arr[] = str.toCharArray();
        char tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;

        return new String(arr);
    }

    static void permutation(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
            return;
        }

        for (int i = l; i < r; i++) {
            str = swap(str, l, r);
            permutation(str, l + 1, r);
            str = swap(str, l, r);
        }

    }

    public static void main(String[] args) {
        String str = "abc";

        permutation(str, 0, str.length());
    }
}
