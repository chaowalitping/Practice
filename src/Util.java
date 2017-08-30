/**
 * Created by OS on 8/30/2017.
 */
public class Util {

    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        if (s.length() % 2 == 0) {
            return s.substring(0, s.length() / 2).equals(new StringBuilder(s.substring(s.length() / 2, s.length())).reverse().toString());
        }
        return s.substring(0, (s.length() - 1) / 2).equals(new StringBuilder(s.substring((s.length() + 1) / 2, s.length())).reverse().toString());
    }
}