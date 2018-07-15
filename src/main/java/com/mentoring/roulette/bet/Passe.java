package com.mentoring.roulette.bet;

import java.util.stream.IntStream;

public class Passe {

    public int[] generateRangeFrom1to18() {
        return IntStream.rangeClosed(1, 18).toArray();
    }
}
