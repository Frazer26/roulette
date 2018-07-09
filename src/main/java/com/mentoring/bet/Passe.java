package com.mentoring.bet;

import java.util.stream.IntStream;

public class Passe {

    public int[] generateRangeFrom1to18() {
        return IntStream.rangeClosed(1, 18).toArray();
    }
}
