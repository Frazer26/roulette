package com.mentoring.roulette;

import com.mentoring.roulette.bet.Bet;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.mentoring.roulette.BetHelper.evaulateOneBet;
import static com.mentoring.roulette.BetHelper.generateRandomBetTypeAndMoney;

public class Player {

    private String name;
    private int money;
    private boolean inPlay;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
        inPlay = true;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money += money;
    }

    public boolean isInPlay() {
        return inPlay;
    }

    public void setInPlay(boolean inPlay) {
        this.inPlay = inPlay;
    }





}
