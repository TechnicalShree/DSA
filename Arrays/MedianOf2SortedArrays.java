package Arrays;

class MedianOf2SortedArrays {
    public static int[] merge(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] list = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (nums1[i] < nums2[j])
                list[k++] = nums1[i++];
            else
                list[k++] = nums2[j++];
        }

        while (i < n) {
            list[k++] = nums1[i++];
        }
        while (j < m) {
            list[k++] = nums2[j++];
        }
        return list;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = merge(nums1, nums2);
        int n = res.length;
        double ans = 0;

        if (n % 2 == 0) {
            ans = ((double) res[n / 2 - 1] + (double) res[n / 2]) / 2;
        } else {
            ans = res[n / 2];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 7, 8, 10 };
        int[] arr2 = { 2, 3, 6, 9 };

        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}

// 4. Median of Two Sorted Arrays :-

// Given two sorted arrays nums1 and nums2 of size m and n respectively, return
// the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

// Constraints:

// nums1.length == m
// nums2.length == n
// 0 <= m <= 1000
// 0 <= n <= 1000
// 1 <= m + n <= 2000
// -106 <= nums1[i], nums2[i] <= 106