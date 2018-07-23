package com.mentoring.roulette.bet;

public class Red implements BetType {

    private static final int MULTIPLIER = 2;

    public int[] playedNumbers() {
        int[] redNums = new int[18];
        int j = 0;
        for (int i = 0; i < 18; i++, j++) {
            if (i == 5 || i == 14) {
                j++;
            } else if (i == 9) {
                j--;
            }
            redNums[i] = ++j;
        }
        return redNums;
    }

    public int getMultiplier() {
        return MULTIPLIER;
    }
}
