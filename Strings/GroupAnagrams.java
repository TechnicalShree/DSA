package Strings;

import java.util.*;

public class GroupAnagrams {
    public static final int d = 256;

    public static List<List<String>> groupAnagrams(String[] strs, int q) {
        List<List<String>> res = new ArrayList<>();

        int txt = 0;
        HashMap<String, Integer> map = new HashMap<>();

        int n = strs.length;
        for (int i = 0; i < n; i++) {
            int m = strs[i].length();
            for (int j = 0; j < m; j++) {
                txt += (strs[i].charAt(j) - 'a');
            }
            map.put(strs[i], txt);
            txt = 0;
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }

        return res;
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        int q = 127;

        System.out.println(groupAnagrams(strs, q));
    }
}
