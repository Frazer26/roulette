package com.mentoring.roulette.bet;

import java.util.Random;

public class OneNum implements BetType {

    public int[] playedNumbers() {
        Random rnd = new Random();
        return new int[]{rnd.nextInt((37))};
    }

    public int getMultiplier() {
        return 36;
    }
}
