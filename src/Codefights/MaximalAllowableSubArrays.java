package Codefights;

/**
 * Created by OS on 29/9/2560.
 */
public class MaximalAllowableSubArrays {

//    Given an array of integers inputArray and an integer maxSum, for each i (0 ≤ i < length of inputArray) find the rightmost j (j < length of inputArray) such that the sum of all elements between the ith and jth elements (both inclusive) is not greater than maxSum.
//
//    Example
//
//    For inputArray = [2, 3, 0, 1, 2] and maxSum = 4, the output should be
//    maximalAllowableSubarrays(inputArray, maxSum) = [0, 3, 4, 4, 4].
//
//    Input/Output
//
//  [time limit] 3000ms (java)
//  [input] array.integer inputArray
//
//    A non-empty array of non-negative integers.
//
//    Guaranteed constraints:
//            5 ≤ inputArray.length ≤ 104,
//            0 ≤ inputArray[i] ≤ 106.
//
//            [input] integer maxSum
//
//    A non-negative integer not less than each of the array elements.
//
//    Guaranteed constraints:
//    max(inputArray) ≤ maxSum ≤ 109.
//
//            [output] array.integer

    public static int[] maximalAllowableSubarrays(int[] r, int s) {
        int n = r.length;

        int[] x = new int[n];
        for (int j = 0; j < n; j++) {
            int[] a = new int[n - j];
            long l = 0;
            int c = 0;
            for (int i = j; i < n; i++) {
                l += r[i];
                a[c] = (int) l;
                c++;
            }
            int m = a.length;
            for (int i = 0; i < m; i++) {
                if (a[i] > s) {
                    x[j] = n - m + i - 1;
                    break;
                } else if (i == m - 1) x[j] = n - 1;
            }
        }

        return x;
    }

    // timeout
    public static int[] maximalAllowableSubarrays2(int[] r, int s) {
        int n = r.length;
        int[] a = new int[n];
        int x = 0;
        long l;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                l = 0;
                for (int k = i; k <= j; k++) {
                    l += r[k];
                }
                if (l <= s) x = j;
                else break;
            }
            a[i] = x;
        }

        return a;
    }
}
