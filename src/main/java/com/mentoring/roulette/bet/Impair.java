package com.mentoring.roulette.bet;

import java.util.stream.IntStream;

public class Impair {

    public int[] generateOddNums() {
        return IntStream.rangeClosed(1, 36).filter(n -> n % 2 != 0).toArray();
    }

}
