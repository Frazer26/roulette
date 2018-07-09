package com.mentoring.bet;

import java.util.stream.IntStream;

import static com.mentoring.bet.Dozen.getRandomNumFromArray;

public class FourNums {

    public int[] returnFourNums() {
        int rndmStartNum = getRandomNumFromArray(startNums());
        int endNum = rndmStartNum + 4;
        int[] fiveNumsRange = IntStream.rangeClosed(rndmStartNum, endNum).toArray();
        int[] fourNumsRange = new int[4];
        int j = 0;
        for (int i = 0; i < fiveNumsRange.length; i++) {
            if (i == 2) {
                i++;
            }
            fourNumsRange[j] = fiveNumsRange[i];
            j++;
        }
        return fourNumsRange;
    }

    public int[] startNums() {
        return IntStream.rangeClosed(1, 36).filter(n -> n % 3 != 0).toArray();
    }
}
