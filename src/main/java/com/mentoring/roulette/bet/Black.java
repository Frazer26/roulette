package com.mentoring.roulette.bet;

public class Black implements BetType {

    public int[] playedNumbers() {
        int[] blackNums = new int[18];
        int j = 1;
        for (int i = 0; i < 18; i++, j++) {
            if (i == 5 || i == 14) {
                j--;
            } else if (i == 9) {
                j++;
            }
            blackNums[i] = ++j;
        }
        return blackNums;
    }

    public int getMultiplier() {
        return 2;
    }


}
