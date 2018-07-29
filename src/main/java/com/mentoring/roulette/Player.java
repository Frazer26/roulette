package com.mentoring.roulette;

public class Player {

    private String name;
    private int money;
    private boolean inPlay;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
        inPlay = true;
    }


    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getMoney() {
        return money;
    }

    void setMoney(int money) {
        this.money += money;
    }

    boolean isInPlay() {
        return inPlay;
    }

    void setInPlay(boolean inPlay) {
        this.inPlay = inPlay;
    }


}
