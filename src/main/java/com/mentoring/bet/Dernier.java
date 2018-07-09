package com.mentoring.bet;

import java.util.stream.IntStream;

public class Dernier {

    public int[] getPremierNums() {
        return IntStream.rangeClosed(1, 36).filter(n -> n % 3 == 0).toArray();
    }
}