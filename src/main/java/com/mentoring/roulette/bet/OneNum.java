package com.mentoring.roulette.bet;

import java.util.Random;

public class OneNum implements BetType {

    private static final int MULTIPLIER = 36;

    public int[] playedNumbers() {
        Random rnd = new Random();
        return new int[]{rnd.nextInt((37))};
    }

    public int getMultiplier() {
        return MULTIPLIER;
    }
}
