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
