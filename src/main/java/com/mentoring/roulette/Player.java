package com.mentoring.roulette;

import com.mentoring.roulette.bet.Bet;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private int money;
    private boolean isInPlay;
    private List<Bet> listOfBets;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
        isInPlay = true;
        listOfBets = new ArrayList<>;
    }

    public void clearBets() {
        listOfBets.clear();
    }

    public void makeBet() {
        Bet bet = generate(money);
        int betAmount = bet.getAmount() * -1;

        setListOfBets(bet);
        setMoney(betAmount);
    }

    public void lose() {
        if (money == 0) {
            isInPlay = false;
        }
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
        return isInPlay;
    }

    public void setInPlay(boolean inPlay) {
        isInPlay = inPlay;
    }

    public List<Bet> getListOfBets() {
        return listOfBets;
    }

    public void setListOfBets(Bet bet) {
        this.listOfBets.add(bet);
    }
}
