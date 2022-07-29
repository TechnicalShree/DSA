import java.util.*;;

//[1,2,2,1,3,4,3]

public class MockInterview {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 3, 4, 3 };
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == 1) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
