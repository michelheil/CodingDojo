package primeFactors;

import java.util.*;

public class PrimeFactors {
    public static List<Integer> generate(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        if (n > 1) {
            if (n % 2 == 0) {
                primes.add(2);
                n /= 2;
            }
            if (n > 1) {
                primes.add(n);
            }
        }
        return primes;
    }
}
