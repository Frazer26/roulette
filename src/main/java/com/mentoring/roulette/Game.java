package com.mentoring.roulette;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    int round;
    List<Player> listOfPlayers = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void scanFromConsole() {
        Scanner scn = new Scanner(System.in);
        String name;
        int money;
        System.out.println("How many rounds would you like to play?");
        round = scn.nextInt();
        for (int i=1; i<=4; i++) {
            System.out.println("Please write your name: ");
            name = scn.nextLine();
            System.out.println("Please give me your money: ");
            money = scn.nextInt();
            listOfPlayers.add(new Player(name, money));
        }
    }
}
