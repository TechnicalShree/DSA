package Arrays;

public class SortThreeNums {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 0, 2 };
        int[] res = new int[arr.length];
        int zeros = 0, ones = 0, twos = 0;

        for (int i : arr) {
            if (i == 0)
                zeros++;
            if (i == 1)
                ones++;
            if (i == 2)
                twos++;
        }

        int i = 0;
        while (zeros-- > 0) {
            res[i++] = 0;
        }
        while (ones-- > 0) {
            res[i++] = 1;
        }
        while (twos-- > 0) {
            res[i++] = 2;
        }

        for (int j : res) {
            System.out.print(j + " ");
        }
    }
}
