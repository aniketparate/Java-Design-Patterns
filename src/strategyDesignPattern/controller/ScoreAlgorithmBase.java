package strategyDesignPattern.controller;

public abstract class ScoreAlgorithmBase {
    public abstract int calculateScore(int taps, int multiplier);
    public abstract int countTaps(int taps);
}
