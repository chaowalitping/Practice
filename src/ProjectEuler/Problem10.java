package ProjectEuler;

/**
 * Created by OS on 9/6/2017.
 */
public class Problem10 {

//    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//    Find the sum of all the primes below two million.

    public static long solve(int n) { // 2000000
        long result = n >= 2 ? 2 : 0;
        for (long i = 3; i < n; i+=2) {
            if (Util.isPrime(i)) result += i;
        }
        return result;
    }

}
