package com.mentoring.roulette.bet;

public class Bet {
    BetType bet;
    int amount;

    public Bet(BetType bet, int amount) {
        this.bet = bet;
        this.amount = amount;
    }

    public BetType getBet() {
        return bet;
    }

    public void setBet(BetType bet) {
        this.bet = bet;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
