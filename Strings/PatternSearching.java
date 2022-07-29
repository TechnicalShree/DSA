package Strings;
// Rabin-Karp Algorithm for Pattern Searching

class PatternSearching {
    public final static int d = 256;

    public static void search(String pat, String txt, int q) {
        int n = txt.length(); // Text length
        int m = pat.length(); // Pattern length
        int i, j;
        int p = 0; // hash for pattern
        int t = 0; // hash for text
        int h = 1;

        // the value of h would be "pow(d, m-1)%q"
        for (i = 0; i < m - 1; i++)
            h = (h * d) % q;

        // Calculate the hash value of pattern and first window
        for (i = 0; i < m; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }
        System.out.println(p + " " + t);

        // Slide the pattern over the text one by one
        for (i = 0; i <= n - m; i++) {

            System.out.println(t);

            // Check the hash value of the current window of the text and the pattern.
            // If hash value matches then only check number one by one.
            if (p == t) {
                // Check for each characters
                for (j = 0; j < m; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        break;
                    }
                }

                // if p == t and pat[0, ..., m-1] = txt[i, ..., i+m-1] then
                if (j == m)
                    System.out.println("Pattern found at index :- " + i);
            }

            // Calculate the hash value for the next window of the text :
            // By removing the leading char and adding trailing char
            if (i < n - m) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;

                // We might get negative value of t, converting it
                // to positive
                if (t < 0)
                    t = (t + q);
            }
        }
    }

    public static void main(String[] args) {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";

        // A prime number
        int q = 127;

        // Function Call
        search(pat, txt, q);
    }
}
