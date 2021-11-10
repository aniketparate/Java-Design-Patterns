package strategyDesignPattern;

import strategyDesignPattern.controller.ScoreBoard;
import strategyDesignPattern.model.Balloon;
import strategyDesignPattern.model.Clown;
import strategyDesignPattern.model.SquareBalloon;

public class Main {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print(" Balloon Tap Score : ");
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);
        System.out.print(" ");
        scoreBoard.showTaps(5);

        System.out.print(" Clown Tap Score : ");
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);
        System.out.print(" ");
        scoreBoard.showTaps(10);

        System.out.print(" SquareBalloon Tap Score : ");
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);
        System.out.print(" ");
        scoreBoard.showTaps(15);
    }
}
