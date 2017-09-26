import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by OS on 7/9/2560.
 */
public class Problem14 {

    public static int count = 0;

//    The following iterative sequence is defined for the set of positive integers:
//
//    n → n/2 (n is even)
//    n → 3n + 1 (n is odd)
//
//    Using the rule above and starting with 13, we generate the following sequence:
//
//            13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//    It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//    Which starting number, under one million, produces the longest chain?
//
//    NOTE: Once the chain starts the terms are allowed to go above one million.

    public static double solve(int n) {
        double max = 0;
        for (int i = 1; i < n; i++) {
            count = 0;
            collatz(i);
            if (count > max) max = count;
        }
        return max;
    }

    public static void collatz(int startNumber) {
        count++;
        if (startNumber == 1) return;
        if (startNumber % 2 == 0) collatz(startNumber / 2);
        else collatz(3 * startNumber + 1);
    }

}
