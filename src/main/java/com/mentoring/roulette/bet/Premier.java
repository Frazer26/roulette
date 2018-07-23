package com.mentoring.roulette.bet;

import java.util.stream.IntStream;

public class Premier implements BetType {

    private static final int MULTIPLIER = 3;

    public int[] playedNumbers() {
        return IntStream.rangeClosed(1, 36).filter(n -> n % 3 == 1).toArray();
    }

    public int getMultiplier() {
        return MULTIPLIER;
    }
}
