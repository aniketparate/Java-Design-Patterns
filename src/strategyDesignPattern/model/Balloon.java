package strategyDesignPattern.model;

import strategyDesignPattern.controller.ScoreAlgorithmBase;

public class Balloon extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }

    @Override
    public int countTaps(int taps) {
        return taps;
    }
}
