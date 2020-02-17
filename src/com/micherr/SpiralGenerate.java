package com.micherr;

import java.util.ArrayList;

public class SpiralGenerate {
    public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int[][] arr = new int[A][A];

        int minCol = 0;
        int minRow = 0;
        int maxCol = A - 1;
        int maxRow = A - 1;
        int current = 1;

        while (minCol < maxCol) {
            for (int i = minCol; i <= maxCol; i++) {
                arr[minRow][i] = current++;
            }
            minRow++;

            for (int i = minRow; i <= maxRow; i++) {
                arr[i][maxCol] = current++;
            }
            maxCol--;

            for (int i = maxCol; i >= minCol; i--) {
                arr[maxRow][i] = current++;
            }
            maxRow--;

            for (int i = maxRow; i >= minRow; i--) {
                arr[i][minCol] = current++;
            }
            minCol++;
        }

        arr[minRow][minCol] = current;

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int[] ints : arr) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int anInt : ints) {
                row.add(anInt);
            }
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = generateMatrix(1);
        System.out.println(arr);
    }
}
