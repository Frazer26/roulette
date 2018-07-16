package com.mentoring.roulette;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private static int round;
    private List<Player> listOfPlayers = new ArrayList<>();

    public static void main(String[] args) {
        Game game = new Game();
        int winnerNum;
        game.scanFromConsole();
        for (int i = 1; i <= round; i++) {
            System.out.println(i + ". round:");
            game.makeBets();
            winnerNum = game.spin();
            game.evaluate(winnerNum);
            game.clearRoundDatas();
        }

    }

    private void scanFromConsole() {
        Scanner scn = new Scanner(System.in);
        String name;
        int money;
        System.out.println("How many rounds would you like to play?");
        round = scn.nextInt();
        for (int i = 1; i <= 4; i++) {
            System.out.println("Please write your name: ");
            name = scn.nextLine();
            System.out.println("Please give me your money: ");
            money = scn.nextInt();
            listOfPlayers.add(new Player(name, money));
        }
    }

    private void makeBets() {
        listOfPlayers.forEach(Player::makeBet);
    }

    private int spin() {
        Random r = new Random();
        return r.ints(0, (37)).findFirst().getAsInt();
    }

    private void evaluate(int winnerNum) {
//        listOfPlayers.forEach(n -> n.evaulatePlayer(winnerNum));
        for (Player player : listOfPlayers) {
            int i = 0;
            System.out.println(player.getName() + ": played amount: " + player.getPlayedAmountInRound() +
                    ", prize: +" + player.getFullPrizeInRound() + ", actual balance: " + player.getMoney());
        }
    }

    private void clearRoundDatas() {
        listOfPlayers.forEach(Player::clearRoundDatas);
    }
}
