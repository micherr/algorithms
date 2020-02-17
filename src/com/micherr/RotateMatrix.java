package com.micherr;

import java.util.ArrayList;

public class RotateMatrix {
    public static void rotate(int[][] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int top = a[0][i];
            int right = a[i][n - 1];
            int bottom = a[n - 1][n - 1 - i];
            int left = a[n - 1 - i][0];
            a[0][i] = left;
            a[i][n - 1] = top;
            a[n - 1][n - 1 - i] = right;
            a[n - 1 - i][0] = bottom;

            top = a[1][i + 1];
            right = a[i + 1][n - 1 -1];
            bottom = a[n - 1 - 1][n - 1 - i - 1];
            left = a[n - 1 - i - 1][1];
            a[1][i+1] = left;
            a[i + 1][n - 1 -1] = top;
            a[n - 1 - 1][n - 1 - i - 1] = right;
            a[n - 1 - i - 1][1] = bottom;
        }
    }

    public static void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();
        for (int i = 0; i < n - 1; i++) {
            int top = a.get(0).get(i);
            int right = a.get(i).get(n-1);
            int bottom = a.get(n-1).get(n-1-i);
            int left = a.get(n-1-i).get(0);
            a.get(0).set(i,left);
            a.get(i).set(n-1,top);
            a.get(n-1).set(n-1-i,right);
            a.get(n-1-i).set(0, bottom);
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                new int[]{31, 32, 228, 333},
                new int[]{79, 197, 241, 246},
                new int[]{77, 84, 126, 337},
                new int[]{110, 291, 356, 371}
        };
        rotate(arr);
        print(arr);
    }

    private static void print(int[][] ar) {
        for (int[] ints : ar) {
            for (int i : ints) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}
