package com.mentoring.roulette.bet;

public class Bet {
    private BetType betType;
    private int amount;  //how much do I play (dollar, ft, etc.)?
    private int prize; //how much do I win?
    private int[] playedNumbers;

    public Bet(BetType betType, int amount) {
        this.betType = betType;
        this.amount = amount;
        playedNumbers = betType.playedNumbers();
    }

    public BetType getBetType() {
        return betType;
    }

    public void setBetType(BetType betType) {
        this.betType = betType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int[] getPlayedNumbers() {
        return playedNumbers;
    }

    public void setPlayedNumbers(int[] playedNumbers) {
        this.playedNumbers = playedNumbers;
    }
}
