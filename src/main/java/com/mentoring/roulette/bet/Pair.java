package com.mentoring.roulette.bet;

import java.util.stream.IntStream;

public class Pair implements BetType {

    public int[] playedNumbers() {
        return IntStream.rangeClosed(1, 36).filter(n -> n % 2 == 0).toArray();
    }

    public int getMultiplier() {
        return 2;
    }
}
