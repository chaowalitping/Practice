/**
 * Created by OS on 8/30/2017.
 */
public class Problem3 {

//    The prime factors of 13195 are 5, 7, 13 and 29.
//
//    What is the largest prime factor of the number 600851475143 ?

    public static long solve(long l) {
        long result = 0;
        if (l >= 2 && l % 2 == 0) result = 2;
        for (long i = 3; i * i <= l; i += 2) {
            if (l % i == 0) {
                if (Util.isPrime(i)) {
                    result = i > result ? i : result;
                }
            }
        }
        return result;
    }

}
