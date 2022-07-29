package Math;

class GCD {
    public static void euclidGcd(int a, int b) {
        if (b == 0) {
            System.out.println(a);
            return;
        }
        euclidGcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 360, b = 210;

        euclidGcd(a, b);
    }
}
