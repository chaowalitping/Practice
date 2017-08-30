/**
 * Created by OS on 8/30/2017.
 */
public class Problem4 {

//    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//    Find the largest palindrome made from the product of two 3-digit numbers.

    public static int solve(int n) {
        n = (int) Math.pow(10, n) - 1;
        int result = 0;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                if (Util.isPalindrome((i * j) + "")) {
                    result = i * j > result ? i * j : result;
                }
            }
        }
        return result;
    }
}
