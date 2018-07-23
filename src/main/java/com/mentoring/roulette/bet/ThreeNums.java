package com.mentoring.roulette.bet;

import java.util.Random;
import java.util.stream.IntStream;

import static com.mentoring.roulette.bet.Dozen.getRandomNumFromArray;

public class ThreeNums implements BetType {

    private static final int MULTIPLIER = 12;

    public int[] playedNumbers() {
        Random rnd = new Random();
        boolean isHorizontal = rnd.nextBoolean();

        int[] table = IntStream.rangeClosed(1, 36).toArray();
        int strtNm = getRandomNumFromArray(table);
        int[] returnThreeNum = new int[3];

        if (isHorizontal) {
            if (strtNm % 3 == 1) {
                returnThreeNum[0] = strtNm;
                returnThreeNum[1] = strtNm + 1;
                returnThreeNum[2] = strtNm + 2;
            } else if (strtNm % 3 == 0) {
                returnThreeNum[0] = strtNm;
                returnThreeNum[1] = strtNm - 1;
                returnThreeNum[2] = strtNm - 2;
            } else {
                returnThreeNum[0] = strtNm;
                returnThreeNum[1] = strtNm - 1;
                returnThreeNum[2] = strtNm + 1;
            }
        } else {
            if (strtNm >= 1 && strtNm <= 3) {
                returnThreeNum[0] = strtNm;
                returnThreeNum[1] = strtNm + 3;
                returnThreeNum[2] = strtNm + 6;
            } else if (strtNm >= 34 && strtNm <= 36) {
                returnThreeNum[0] = strtNm;
                returnThreeNum[1] = strtNm - 3;
                returnThreeNum[2] = strtNm - 6;
            } else {
                returnThreeNum[0] = strtNm;
                returnThreeNum[1] = strtNm - 3;
                returnThreeNum[2] = strtNm + 3;
            }
        }
        return returnThreeNum;
    }

    public int getMultiplier() {
        return MULTIPLIER;
    }

}

