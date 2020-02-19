package com.micherr;

public class RotateMatrix {
    public static void rotate(int[][] a) {
        int n = a.length;
        for (int j = 0; j < n / 2; j++) {
            for (int i = j; i < n - 1 - j; i++) {
                int top = a[j][i];
                int right = a[i][n - 1 - j];
                int bottom = a[n - 1 - j][n - 1 - i];
                int left = a[n - 1 - i][j];
                a[j][i] = left;
                a[i][n - 1 - j] = top;
                a[n - 1 - j][n - 1 - i] = right;
                a[n - 1 - i][j] = bottom;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = SpiralGenerate.generateMatrix(3);
        Utils.print(arr);
        System.out.println("\n");

        rotate(arr);
        Utils.print(arr);
    }
}
