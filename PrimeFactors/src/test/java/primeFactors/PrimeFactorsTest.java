package primeFactors;

import static primeFactors.PrimeFactors.generate;
import junit.framework.TestCase;
import java.util.*;

public class PrimeFactorsTest extends TestCase{

    public List<Integer> list(int... ints) throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        for(int i : ints) {
            list.add(i);
        }
        return list;
    }

    public void testOneGenerate() throws Exception {
        assertEquals(list(), generate(1));
    }

    public void testTwoGenerate() throws Exception {
        assertEquals(list(2), generate(2));
    }

    public void testThreeGenerate() throws Exception {
        assertEquals(list(3), generate(3));
    }

    public void testFourGenerate() throws Exception {
        assertEquals(list(2,2), generate(4));
    }

    public void testSixGenerate() throws Exception {
        assertEquals(list(2,3), generate(6));
    }

    public void testEightGenerate() throws Exception {
        assertEquals(list(2,2,2), generate(8));
    }

    public void testNineGenerate() throws Exception {
        assertEquals(list(3,3), generate(9));
    }
}