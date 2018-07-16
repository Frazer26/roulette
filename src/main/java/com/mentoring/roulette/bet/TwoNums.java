package com.mentoring.roulette.bet;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

import static com.mentoring.roulette.bet.Dozen.getRandomNumFromArray;

public class TwoNums implements BetType {

    public int[] playedNumbers() {

        Random rnd = new Random();
        int[] table = IntStream.rangeClosed(1, 36).toArray();
        int strtNm = getRandomNumFromArray(table);
        ArrayList<Integer> possibleAdjacentNumbs = new ArrayList<>();

        if (strtNm == 1) {
            possibleAdjacentNumbs.add(strtNm + 1);
            possibleAdjacentNumbs.add(strtNm + 3);
        } else if (strtNm == 2) {
            possibleAdjacentNumbs.add(strtNm - 1);
            possibleAdjacentNumbs.add(strtNm + 1);
            possibleAdjacentNumbs.add(strtNm + 3);
        } else if (strtNm == 3) {
            possibleAdjacentNumbs.add(strtNm - 1);
            possibleAdjacentNumbs.add(strtNm + 3);
        } else if (strtNm == 34) {
            possibleAdjacentNumbs.add(strtNm + 1);
            possibleAdjacentNumbs.add(strtNm - 3);
        } else if (strtNm == 35) {
            possibleAdjacentNumbs.add(strtNm - 1);
            possibleAdjacentNumbs.add(strtNm + 1);
            possibleAdjacentNumbs.add(strtNm - 3);
        } else if (strtNm == 36) {
            possibleAdjacentNumbs.add(strtNm - 3);
            possibleAdjacentNumbs.add(strtNm - 1);
        } else if (strtNm % 3 == 2) {
            possibleAdjacentNumbs.add(strtNm - 1);
            possibleAdjacentNumbs.add(strtNm + 1);
            possibleAdjacentNumbs.add(strtNm + 3);
            possibleAdjacentNumbs.add(strtNm - 3);
        } else if (strtNm % 3 == 1) {
            possibleAdjacentNumbs.add(strtNm + 1);
            possibleAdjacentNumbs.add(strtNm + 3);
            possibleAdjacentNumbs.add(strtNm - 3);
        } else if (strtNm % 3 == 0) {
            possibleAdjacentNumbs.add(strtNm - 1);
            possibleAdjacentNumbs.add(strtNm + 3);
            possibleAdjacentNumbs.add(strtNm - 3);
        }

        int rndmItemFromArrayList = possibleAdjacentNumbs.get(rnd.nextInt(possibleAdjacentNumbs.size()));

        return new int[]{strtNm, rndmItemFromArrayList};
    }

    public int getMultiplier() {
        return 18;
    }
}
