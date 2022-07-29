import java.io.*;
import java.util.*;

public class BuffereReader {
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bi = new BufferedReader(is);
		int t = Integer.parseInt(bi.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(bi.readLine());
			long arr[] = new long[n];
			String str[] = bi.readLine().split(" ");
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			System.out.println(minCost(arr, n));
		}
	}

	public static long minCost(long[] arr, int n) {
		PriorityQueue<Long> q = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			q.add(arr[i]);
		}
		long result = 0;
		while (q.size() > 1) {
			long r = q.poll() + q.poll();
			result += r;
			q.add(r);
		}

		return result;
	}

}
