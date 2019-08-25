package primeFactors;

import static primeFactors.PrimeFactors.generate;
import junit.framework.TestCase;
import java.util.*;

public class PrimeFactorsTest extends TestCase {

    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : ints) {
            list.add(i);
        }
        return list;
    }

    public void testOneGenerate() {
        assertEquals(list(), generate(1));
    }

    public void testTwoGenerate() {
        assertEquals(list(2), generate(2));
    }

    public void testThreeGenerate() {
        assertEquals(list(3), generate(3));
    }

}