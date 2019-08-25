package bowlingGame;

import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
    private BowlingGame g;

    protected void setUp() throws Exception {
        g = new BowlingGame();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }

    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    public void testAllOne() throws Exception {
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

    public void testOneSpare() throws Exception {
        rollSpare();
        g.roll(3);
        rollMany(17,0);
        assertEquals(16, g.score());
    }

}