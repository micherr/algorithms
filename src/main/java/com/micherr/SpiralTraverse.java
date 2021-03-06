package com.micherr;

public class SpiralTraverse {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9}
        };

        int minCol = 0;
        int minRow = 0;
        int maxCol = arr.length - 1;
        int maxRow = arr.length - 1;

        do {
            for (int i = minCol; i <= maxCol; i++) {
                System.out.println(arr[minRow][i]);
            }
            minRow++;

            for (int i = minRow; i <= maxRow; i++) {
                System.out.println(arr[i][maxCol]);
            }
            maxCol--;

            for (int i = maxCol; i >= minCol; i--) {
                System.out.println(arr[maxRow][i]);
            }
            maxRow--;

            for (int i = maxRow; i >= minRow; i--) {
                System.out.println(arr[i][minCol]);
            }
            minCol++;
        } while (minCol < maxCol);

        System.out.println(arr[minRow][minCol]);
    }
}
