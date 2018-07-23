package com.mentoring.roulette.bet;

import java.util.stream.IntStream;

public class Manque implements BetType {

    private static final int MULTIPLIER = 3;


    public int[] playedNumbers() {
        return IntStream.rangeClosed(19, 36).toArray();
    }

    public int getMultiplier() {
        return MULTIPLIER;
    }

}
