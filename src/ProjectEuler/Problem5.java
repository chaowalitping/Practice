package ProjectEuler;

/**
 * Created by OS on 8/30/2017.
 */
public class Problem5 {

//    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

    public static long solve(int n) { // 20
        long result = 1;
        for (int i = 2; i <= n; i++) {
            if (result % i != 0)
                result = Util.lcm((int) result, i);
        }
        return result;
    }
}
