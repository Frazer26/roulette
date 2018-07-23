package com.mentoring.roulette.bet;


import java.util.stream.IntStream;

import static com.mentoring.roulette.bet.Dozen.getRandomNumFromArray;

public class SixNums implements BetType {

    private static final int MULTIPLIER = 6;

    public int[] playedNumbers() {
        int[] startNums = {1, 7, 13, 19, 25, 31};
        int rndmStartNum = getRandomNumFromArray(startNums);
        int endNum = rndmStartNum + 5;
        return IntStream.rangeClosed(rndmStartNum, endNum).toArray();
    }

    public int getMultiplier() {
        return MULTIPLIER;
    }
}
