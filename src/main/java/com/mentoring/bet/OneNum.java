package com.mentoring.bet;

import java.util.Random;

public class OneNum {

    public int returnOneNum() {
        Random rnd = new Random();
        return rnd.nextInt((36 + 1));
    }
}
