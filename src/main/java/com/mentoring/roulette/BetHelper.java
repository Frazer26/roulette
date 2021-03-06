package com.mentoring.roulette;

import com.mentoring.roulette.bet.*;

import java.util.Arrays;
import java.util.Random;

class BetHelper {

    static Bet generateRandomBetTypeAndMoney(int money) {
        int rndmBetAmount = generateRandomNumsFromTo(1, money);
        BetType betType = getRandomBetFromArray(makeBetTypeArray());
        return new Bet(betType, rndmBetAmount);
    }

    private static BetType getRandomBetFromArray(BetType[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    private static BetType[] makeBetTypeArray() {
        BetType[] arrayOfBetType = new BetType[15];
        arrayOfBetType[0] = new Black();
        arrayOfBetType[1] = new Dernier();
        arrayOfBetType[2] = new Dozen();
        arrayOfBetType[3] = new FourNums();
        arrayOfBetType[4] = new Impair();
        arrayOfBetType[5] = new Manque();
        arrayOfBetType[6] = new Moyen();
        arrayOfBetType[7] = new OneNum();
        arrayOfBetType[8] = new Pair();
        arrayOfBetType[9] = new Passe();
        arrayOfBetType[10] = new Premier();
        arrayOfBetType[11] = new Red();
        arrayOfBetType[12] = new SixNums();
        arrayOfBetType[13] = new ThreeNums();
        arrayOfBetType[14] = new TwoNums();
        return arrayOfBetType;
    }

    static int evaulateOneBet(Bet bet, int winnerNum) {
        int prize = 0;
        BetType betType = bet.getBetType();
        boolean isWin = Arrays.stream(bet.getPlayedNumbers()).anyMatch(v -> v == winnerNum);
        if (isWin) {
            prize = betType.getMultiplier() * bet.getAmount();
        }
        return prize;
    }

    static int generateRandomNumsFromTo(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

}
