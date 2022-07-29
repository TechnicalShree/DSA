package Strings;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        String res = "";
        int n = s.length();
        int chIdx;

        for (int i = 0; i < numRows; i++) {
            int t = i;
            if (i == 0) {
                chIdx = (numRows - i - 2) * 2 + 2;
                while (t < n) {
                    res += s.charAt(t);
                    if (chIdx != 0) {
                        t = t + chIdx;
                    } else {
                        t += 1;
                    }
                }
            } else if (i == numRows - 1) {
                chIdx = (i - 1) * 2 + 2;
                while (t < n) {
                    res += s.charAt(t);
                    t = t + chIdx;
                }
            } else {
                while (t < n) {
                    res += s.charAt(t);
                    chIdx = (numRows - i - 2) * 2 + 2;
                    t += chIdx;
                    if (t < n) {
                        res += s.charAt(t);
                        chIdx = (i - 1) * 2 + 2;
                        t += chIdx;
                    }
                }
            }
        }

        return res;
    };

    public static void main(String[] args) {
        String str = "a";
        System.out.println(convert(str, 1));
    }
}

// 6. Zigzag Conversion :-

// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
// of rows like this: (you may want to display this pattern in a fixed font for
// better legibility)

// P A H N
// A P L S I I G
// Y I R
// And then read line by line: "PAHNAPLSIIGYIR"

// Write the code that will take a string and make this conversion given a
// number of rows:

// string convert(string s, int numRows);

// Example 1:

// Input: s = "PAYPALISHIRING", numRows = 3
// Output: "PAHNAPLSIIGYIR"
// Example 2:

// Input: s = "PAYPALISHIRING", numRows = 4
// Output: "PINALSIGYAHRPI"
// Explanation:
// P I N
// A L S I G
// Y A H R
// P I
// Example 3:

// Input: s = "A", numRows = 1
// Output: "A"

// Constraints:

// 1 <= s.length <= 1000
// s consists of English letters (lower-case and upper-case), ',' and '.'.
// 1 <= numRows <= 1000