package Recursion;

public class PrintAllPowerSet {
    static void printAllPowerSet(String str, int i, String curr) {
        if (i == str.length()) {
            System.out.println(curr);
            return;
        }

        printAllPowerSet(str, i + 1, curr);
        printAllPowerSet(str, i + 1, curr + str.charAt(i));
    }

    public static void main(String[] args) {
        String str = "abc";
        printAllPowerSet(str, 0, "");
    }
}