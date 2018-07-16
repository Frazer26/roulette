package com.mentoring.roulette.bet;

import java.util.Random;
import java.util.stream.IntStream;

import static com.mentoring.roulette.bet.Dozen.getRandomNumFromArray;

public class FourNums implements BetType {

    public int[] playedNumbers() {
        //how to rotate
        Random rnd = new Random();
        boolean rotate = rnd.nextBoolean();

        int[] table = IntStream.rangeClosed(1, 36).toArray();
        int strtNm = getRandomNumFromArray(table);
        int[] returnRandomFourNumbs = new int[4];

        if (strtNm % 3 == 1 || strtNm % 3 == 2) {
            if (strtNm >= 4 && strtNm <= 32) {
                if (rotate) {
                    returnRandomFourNumbs[0] = strtNm;
                    returnRandomFourNumbs[1] = strtNm + 1;
                    returnRandomFourNumbs[2] = strtNm + 3;
                    returnRandomFourNumbs[3] = strtNm + 4;
                } else {
                    returnRandomFourNumbs[0] = strtNm;
                    returnRandomFourNumbs[1] = strtNm + 1;
                    returnRandomFourNumbs[2] = strtNm - 2;
                    returnRandomFourNumbs[3] = strtNm - 3;
                }
            }
            if (strtNm == 35 || strtNm == 34) {
                returnRandomFourNumbs[0] = strtNm;
                returnRandomFourNumbs[1] = strtNm + 1;
                returnRandomFourNumbs[2] = strtNm - 2;
                returnRandomFourNumbs[3] = strtNm - 3;
            } else {
                returnRandomFourNumbs[0] = strtNm;
                returnRandomFourNumbs[1] = strtNm + 1;
                returnRandomFourNumbs[2] = strtNm + 3;
                returnRandomFourNumbs[3] = strtNm + 4;
            }
        } else {
            //6-36
            if (rotate || strtNm == 36) {
                returnRandomFourNumbs[0] = strtNm;
                returnRandomFourNumbs[1] = strtNm - 1;
                returnRandomFourNumbs[2] = strtNm - 3;
                returnRandomFourNumbs[3] = strtNm - 4;
                //3-33
            } else {
                returnRandomFourNumbs[0] = strtNm;
                returnRandomFourNumbs[1] = strtNm - 1;
                returnRandomFourNumbs[2] = strtNm + 2;
                returnRandomFourNumbs[3] = strtNm + 3;
            }
        }
        return returnRandomFourNumbs;
    }

    public int getMultiplier() {
        return 9;
    }

}



