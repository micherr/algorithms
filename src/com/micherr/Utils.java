package com.micherr;

import java.util.ArrayList;

public class Utils {
    static ArrayList<ArrayList<Integer>> toArrayList(int[][] array) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int[] ints : array) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int anInt : ints) {
                row.add(anInt);
            }
            result.add(row);
        }

        return result;
    }

    static void print(int[][] ar) {
        for (int[] ints : ar) {
            for (int i : ints) {
                System.out.print((i < 10 ? " " : "") + i + "  ");
            }
            System.out.println();
        }
    }
}
