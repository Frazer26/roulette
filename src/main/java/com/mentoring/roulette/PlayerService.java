package com.mentoring.roulette;

import com.mentoring.roulette.bet.Bet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.mentoring.roulette.BetHelper.evaulateOneBet;
import static com.mentoring.roulette.BetHelper.generateRandomBetTypeAndMoney;

public class PlayerService {

    private int fullPrizeInRound;
    private int playedAmountInRound;
    private HashMap<Player, List<Bet>> playersBetsInRound = new HashMap<>();


    public void clearRoundDatas() {
        fullPrizeInRound = 0;
        playedAmountInRound = 0;
        playersBetsInRound.clear();
    }

    public void makeBets(Player player) {
        int randomBetNumbers = ThreadLocalRandom.current().nextInt(1, 4);
        List<Bet> listOfBets = new ArrayList<>();
        for (int i = 0; i < randomBetNumbers; i++) {
            listOfBets.add(makeBet(player));
        }
        playersBetsInRound.put(player,listOfBets);
    }

    public Bet makeBet(Player player) {
        Bet bet = null;
        if (player.isInPlay()) {
            bet = generateRandomBetTypeAndMoney(player.getMoney());
            int betAmount = bet.getAmount() * -1;

            player.setMoney(betAmount); //decrease money
            player.setInPlay(stillInGame(player));
        }
        return bet;
    }

    public boolean stillInGame(Player player) {
        return player.getMoney() != 0;
    }

    public void evaulatePlayer(Player player, int winnerNum) { //how much do I win in this round?
        int prize;
        List<Bet> listOfBets = playersBetsInRound.get(player);

        for (Bet bet : listOfBets) {
            prize = evaulateOneBet(bet, winnerNum);
            bet.setPrize(prize);
            fullPrizeInRound += prize;
            playedAmountInRound += bet.getAmount();
        }
        player.setMoney(fullPrizeInRound);
        player.setInPlay(stillInGame(player));
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

    public HashMap<Player, List<Bet>> getPlayersBetsInRound() {
        return playersBetsInRound;
    }
}
