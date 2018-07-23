package com.mentoring.roulette.bet;

import java.util.stream.IntStream;

public class Passe implements BetType {

    private static final int MULTIPLIER = 3;

    public int[] playedNumbers() {
        return IntStream.rangeClosed(1, 18).toArray();
    }

    public int getMultiplier() {
        return MULTIPLIER;
    }
}
