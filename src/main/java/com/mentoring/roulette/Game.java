package com.mentoring.roulette;

import java.util.*;

class Game {

    private int round;
    private List<Player> listOfPlayers = new ArrayList<>();
    private PlayerService playerService = new PlayerService();

    void scanFromConsole() {
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

    void makeAllBets() {
        listOfPlayers.forEach(n -> playerService.makeBets(n));
    }

    int spin() {
        Random r = new Random();
        return r.nextInt(37);
    }

    void evaluate(int winnerNum) {
        for (Player player : listOfPlayers) {
            playerService.evaulatePlayer(player, winnerNum);
            System.out.println(player.getName() + ": played amount: " + playerService.getPlayedAmountInRound() +
                    ", prize: +" + playerService.getFullPrizeInRound() + ", actual balance: " + player.getMoney());
        }
    }

    void clearAllRoundData() {
       playerService.clearRoundDatas();
    }

    int getRound() {
        return round;
    }
}
