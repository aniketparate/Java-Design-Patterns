package strategyDesignPattern.controller;

public class ScoreBoard {
    public ScoreAlgorithmBase algorithmBase;

    public void showScore(int taps, int multiplier) {
        System.out.println(algorithmBase.calculateScore(taps, multiplier));
        System.out.println(algorithmBase.countTaps(taps));
    }

    public void showTaps(int taps) {
        System.out.println(algorithmBase.countTaps(taps));
    }
}