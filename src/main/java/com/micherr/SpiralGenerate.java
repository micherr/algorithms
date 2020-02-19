package com.micherr;

public class SpiralGenerate {
    public static int[][] generateMatrix(int A) {
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

        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = generateMatrix(1);
        Utils.print(arr);
    }
}
