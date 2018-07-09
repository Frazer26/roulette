package com.mentoring.roulette;

public class Table {

    public static int[][] updateTable() {
        int[][] table = new int[13][3];
        int num = 1;
        for (int i = 0; i < 3; i++) {
            table[0][i] = 0;
        }
        for (int i = 1; i < 13; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = num++;
            }
        }
        return table;
    }
}
