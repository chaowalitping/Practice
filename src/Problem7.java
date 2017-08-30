/**
 * Created by OS on 8/30/2017.
 */
public class Problem7 {

//    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//    What is the 10 001st prime number?

    public static int solve(int n) {
        int result = 2, index = 1, num = 3;
        if (n == 1) return result;
        while (index < n) {
            if (Util.isPrime(num)) {
                index++;
                result = num;
            }
            num += 2;
        }
        return result;
    }
}
