package com.mentoring.roulette;

import java.util.*;

public class Game {

    private static int round;
    private List<Player> listOfPlayers = new ArrayList<>();

    public static void main(String[] args) {
        Game game = new Game();
        int winnerNum;
        game.scanFromConsole();
        for (int i = 1; i <= round; i++) {
            System.out.println(i + ". round:");
            game.makeAllBets();
            winnerNum = game.spin();
            game.evaluate(winnerNum);
            game.clearAllRoundData();
        }

    }

    private void scanFromConsole() {
        Scanner scn = new Scanner(System.in);
        String name;
        int money;
        try {
            System.out.println("How many rounds would you like to play?");
            round = scn.nextInt();
            for (int i = 1; i <= 4; i++) {  //four player data
                System.out.println("Please write your name: ");
                name = scn.next();
                System.out.println("Please give me your money: ");
                money = scn.nextInt();
                listOfPlayers.add(new Player(name, money));
            }
            scn.close();
        } catch (InputMismatchException e) {
            System.out.println("That's not an appropriate value. Please try again.");
            System.exit(0);
        }
    }

    private void makeAllBets() {
        listOfPlayers.forEach(Player::makeBets);
    }

    private int spin() {
        Random r = new Random();
        return r.nextInt(37);
    }

    private void evaluate(int winnerNum) {
//        listOfPlayers.forEach(n -> n.evaulatePlayer(winnerNum));
        for (Player player : listOfPlayers) {
            player.evaulatePlayer(winnerNum);
            System.out.println(player.getName() + ": played amount: " + player.getPlayedAmountInRound() +
                    ", prize: +" + player.getFullPrizeInRound() + ", actual balance: " + player.getMoney());
        }
    }

    private void clearAllRoundData() {
        listOfPlayers.forEach(Player::clearRoundDatas);
    }
}
