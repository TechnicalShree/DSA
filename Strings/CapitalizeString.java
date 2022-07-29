package Strings;

public class CapitalizeString {

    public static String searchingChallenge(String str) {

        String numbersOnly = str.replaceAll("[^0-9]", "");
        String lettersOnly = str.replaceAll("[^a-zA-Z]", "");
        int st = Integer.parseInt(numbersOnly);
        int a = lettersOnly.length();
        int sum = 0;
        while (st > 0) {
            sum += st % 10;
            st /= 10;
        }

        float res = sum / a;

        String result = Integer.toString(Math.round(res));

        return result;
    }

    public static String MathChallenge(String str) {
        int decimal = Integer.parseInt(str, 2);
        String res = Integer.toString(decimal);
        return res;
    }

    public static String capitalizeWord(String str) {
        String[] words = str.split("\\s");
        String token = "rp8x15wa4eb";

        String result = "";
        for (String w : words) {
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            result += first.toUpperCase() + afterfirst + " ";
        }

        String ans = result.trim() + token;
        String test = new String();

        for (int i = 0; i < ans.length(); i++) {
            if ((i + 1) % 3 == 0)
                test += "X";
            else
                test += ans.charAt(i);

        }
        return test;
    }

    public static void main(String[] args) {
        // String str = "hello world";
        String str = "Hello6 9World 2, Nic8e D7ay!";
        System.out.print(searchingChallenge(str));
    }
}