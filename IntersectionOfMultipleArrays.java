import java.util.*;

public class IntersectionOfMultipleArrays {
    static List<Integer> intersection(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int[] count = new int[1001];

        for (int[] A : mat)
            for (int a : A)
                ++count[a];

        for (int i = 1; i < 1001; ++i)
            if (count[i] == mat.length)
                ans.add(i);

        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = { { 3, 1, 2, 4, 5 }, { 1, 2, 3, 4 }, { 3, 4, 5, 6 } };

        System.out.println(intersection(mat));
    }
}
