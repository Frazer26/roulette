package com.mentoring.roulette.bet;

import java.util.stream.IntStream;

public class Impair implements BetType {

    private static final int MULTIPLIER = 2;


    public int[] playedNumbers() {
        return IntStream.rangeClosed(1, 36).filter(n -> n % 2 != 0).toArray();
    }

    public int getMultiplier() {
        return MULTIPLIER;
    }

}
