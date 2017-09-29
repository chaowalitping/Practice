package ProjectEuler;

/**
 * Created by OS on 8/30/2017.
 */
public class Problem6 {

//    The sum of the squares of the first ten natural numbers is,
//
//    1^2 + 2^2 + ... + 10^2 = 385
//
//    The square of the sum of the first ten natural numbers is,
//
//    (1 + 2 + ... + 10)^2 = 55^2 = 3025
//
//    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//
//    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


    public static long solve(int n) { // 100
        long sumSq = 0;
        long sqSum = 0;
        for (int i = 1; i <= n; i++) {
            sumSq += i * i;
            sqSum += i;
        }
        return Math.abs(sumSq - sqSum * sqSum);
    }
}
