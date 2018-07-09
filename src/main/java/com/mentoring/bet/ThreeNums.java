package com.mentoring.bet;

import java.util.stream.IntStream;

import static com.mentoring.bet.Dozen.getRandomNumFromArray;

public class ThreeNums {

    public int[] returnThreeNums() {
        int[] startNumsArray = IntStream.rangeClosed(1, 36).filter(n -> n % 3 == 1).toArray();
        int startNumHorizontal = getRandomNumFromArray(startNumsArray);
        return IntStream.rangeClosed(startNumHorizontal, startNumHorizontal + 2).toArray();
    }

}

