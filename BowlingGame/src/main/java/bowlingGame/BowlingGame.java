package bowlingGame;

public class BowlingGame {
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameIndex)) { //strike
                score += 10 + strikeBonus(frameIndex);
                frameIndex += 1;
            } else if (isSpare(frameIndex)) { // spare
                score += 10 + spareBonus(frameIndex);
                frameIndex += 2;
            } else { // regular roll
                score += sumOfPinsInFrame(frameIndex);
                frameIndex += 2;
            }
        }
        return score;
    }

    private Boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

    private Boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }

    private int strikeBonus(int frameIndex) {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private int spareBonus(int frameIndex) {
        return rolls[frameIndex + 2];
    }

    private int sumOfPinsInFrame(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }
}