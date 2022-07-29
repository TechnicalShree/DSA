package Arrays;

import java.util.*;

/**
 * FindAllMissingNums
 */
public class FindAllMissingNums {

    public static void main(String[] args) {

        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        int[] temp = new int[nums.length + 1];

        // increasing every index which has the element present in it...

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }

        List<Integer> list = new ArrayList<>();

        // checking which element is not present in the temp array.
        // which index is having the value of zero that means we did not encounter that
        // element yet so we can say that, this pertticular element is not present in
        // the given array.

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] == 0)
                list.add(i);
        }

        System.out.println(list);
    }
}