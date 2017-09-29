package Codefights;

/**
 * Created by OS on 29/9/2560.
 */
public class MaximalAllowableSubArrays {

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
