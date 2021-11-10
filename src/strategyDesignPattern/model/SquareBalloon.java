package strategyDesignPattern.model;

import strategyDesignPattern.controller.ScoreAlgorithmBase;

public class SquareBalloon extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }

    @Override
    public int countTaps(int taps) {
        return taps;
    }
}
