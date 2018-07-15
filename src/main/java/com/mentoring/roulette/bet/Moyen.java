package com.mentoring.roulette.bet;

import java.util.stream.IntStream;

public class Moyen {

    public int[] getMoyenNums() {
        return IntStream.rangeClosed(1, 36).filter(n -> n % 3 == 2).toArray();
    }
}
