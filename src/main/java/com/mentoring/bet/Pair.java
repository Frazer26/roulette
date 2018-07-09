package com.mentoring.bet;

import java.util.stream.IntStream;

public class Pair {

    public int[] generateEvenNums() {
        return IntStream.rangeClosed(1, 36).filter(n -> n % 2 == 0).toArray();
    }
}
