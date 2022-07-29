package Hashing;

import java.util.HashMap;

public class MajorityNumber {

    public static int majorityElementByMooresVotingAlgo(int[] arr) {
        int ansIndex = 0;
        int cnt = 1;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[ansIndex])
                cnt++;
            else
                cnt--;

            if (cnt == 0) {
                ansIndex = i;
                cnt = 1;
            }
        }
        cnt = 0;

        for (int i : arr) {
            if (arr[ansIndex] == i)
                cnt++;
        }

        if (cnt <= (n / 2))
            ansIndex = -1;

        return ansIndex;
    }

    public static int majorityElementByHashMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int cnt = map.get(arr[i]) + 1;

                if (cnt > n / 2) {
                    return i;
                } else {
                    map.put(arr[i], cnt);
                }

            } else {
                map.put(arr[i], 1);
            }
        }

        return -1;
    }

    public static int majorityElementByBruteForce(int[] arr) {
        int majCnt = 1;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int cnt = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    cnt++;
            }
            if (cnt > n / 2)
                return i;

            if (cnt > majCnt)
                majCnt = cnt;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 3, 1, 3 };

        int index = majorityElementByBruteForce(arr);

        if (index == -1)
            System.out.println("There is no any Majority element present in this array.");
        else
            System.out.println(arr[index] + " is the Majority Index.");
    }
}
