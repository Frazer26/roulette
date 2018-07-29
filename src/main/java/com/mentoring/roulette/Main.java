package com.mentoring.roulette;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        int winnerNum;
        game.scanFromConsole();
        for (int i = 1; i <= game.getRound(); i++) {
            System.out.println(i + ". round:");
            game.makeAllBets();
            winnerNum = game.spin();
            game.evaluate(winnerNum);
            game.clearAllRoundData();
        }

    }

}
