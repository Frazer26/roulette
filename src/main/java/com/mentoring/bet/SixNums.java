package com.mentoring.bet;


import java.util.stream.IntStream;

import static com.mentoring.bet.Dozen.getRandomNumFromArray;

public class SixNums {

    public int[] returnSixNums() {
        int[] startNums = {1, 7, 13, 19, 25, 31};
        int rndmStartNum = getRandomNumFromArray(startNums);
        int endNum = rndmStartNum + 5;
        return IntStream.rangeClosed(rndmStartNum, endNum).toArray();
    }
}
