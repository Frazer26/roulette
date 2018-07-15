package com.mentoring.roulette;

import com.mentoring.roulette.bet.*;

import java.util.Random;

public class BetHelper {

    public Bet generate(int money) {
        Random rnd = new Random();
        int rndmBetAmount = 1 + rnd.nextInt(money - 1) + 1;
        BetType betType = getRandomBetFromArray(makeBetTypeArray());
        return new Bet(betType,rndmBetAmount);
    }

    public BetType getRandomBetFromArray(BetType[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public BetType[] makeBetTypeArray() {
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

}
