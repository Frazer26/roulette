package com.mentoring.roulette.bet;

import java.util.Random;
import java.util.stream.IntStream;

public class Dozen implements BetType {

    private static final int MULTIPLIER = 3;

    public int[] playedNumbers() {
        int[] startNums = {1, 13, 25};
        int rndStartNum = getRandomNumFromArray(startNums);
        int endNum = rndStartNum + 11;
        return IntStream.rangeClosed(rndStartNum, endNum).toArray();
    }

    static int getRandomNumFromArray(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public int getMultiplier() {
        return MULTIPLIER;
    }
}
