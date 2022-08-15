package Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagramsTogather {
    public static void groupAnagramsTogather(String[] arr) {
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                cnt += arr[i].charAt(j) - 'a';
            }
            ArrayList<String> temp = new ArrayList<>();
            if (map.containsKey(cnt)) {
                temp = map.get(cnt);
            }
            temp.add(arr[i]);
            map.put(cnt, temp);
        }
        System.out.println(map);

    }

    public static void main(String[] args) {
        String[] arr = { "bat", "tab", "ant", "tan", "latte", "ettal", "nat" };

        groupAnagramsTogather(arr);
    }
}
