package ProjectEuler;

/**
 * Created by OS on 9/2/2017.
 */
public class Problem9 {

//    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//    a^2 + b^2 = c^2
//    For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
//    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//    Find the product abc.

    public static int solve(int n) { // 1000
        int result = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    if (i + j + k == n && k * k + j * j == i * i) {
                        result = i * j * k;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
