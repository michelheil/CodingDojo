package primeFactors;

import junit.framework.TestCase;

import java.util.*;

public class PrimeFactorsTest extends TestCase {

    private List<Integer> list() {
        return new ArrayList<Integer>();
    }

    public void testOneGenerate() {
        assertEquals(list(), PrimeFactors.generate(1));
    }

}