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
    private List<Bet> listOfBets;
    private int fullPrizeInRound;
    private int playedAmountInRound;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
        inPlay = true;
        listOfBets = new ArrayList<>();
    }

    public void clearRoundDatas() {
        fullPrizeInRound = 0;
        playedAmountInRound = 0;
        listOfBets.clear();
    }

    public void makeBets() {
        int randomBetNumbers = ThreadLocalRandom.current().nextInt(1, 4);
        for (int i = 0; i < randomBetNumbers; i++) {
            makeBet();
        }

    }

    public void makeBet() {
        if (inPlay) {
            Bet bet = generateRandomBetTypeAndMoney(money);
            int betAmount = bet.getAmount() * -1;

            setListOfBets(bet);
            setMoney(betAmount); //decrease money
            stillInGame();
        }
    }

    public void stillInGame() {
        inPlay = money != 0;
    }

    public void evaulatePlayer(int winnerNum) { //how much do I win in this round?
        int prize;
//        listOfBets.stream().forEach(n -> evaulateOneBet(n,winnerNum));
        for (Bet bet : listOfBets) {
            prize = evaulateOneBet(bet, winnerNum);
            bet.setPrize(prize);
            fullPrizeInRound += prize;
            playedAmountInRound += bet.getAmount();
        }
        setMoney(fullPrizeInRound);
        stillInGame();
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

    public List<Bet> getListOfBets() {
        return listOfBets;
    }

    public void setListOfBets(Bet bet) {
        this.listOfBets.add(bet);
    }

    public int getFullPrizeInRound() {
        return fullPrizeInRound;
    }

    public void setFullPrizeInRound(int fullPrizeInRound) {
        this.fullPrizeInRound = fullPrizeInRound;
    }

    public int getPlayedAmountInRound() {
        return playedAmountInRound;
    }

    public void setPlayedAmountInRound(int playedAmountInRound) {
        this.playedAmountInRound = playedAmountInRound;
    }
}
