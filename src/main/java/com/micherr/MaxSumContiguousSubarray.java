package com.micherr;

import java.util.Arrays;
import java.util.List;

public class MaxSumContiguousSubarray {
    public static int maxSubArray(final List<Integer> A) {
        int bestSum = A.get(0);
        for (int i = 0; i < A.size(); i++) {
            int current = A.get(i);
            if (current > bestSum) {
                bestSum = current;
            }

            for (int j = i + 1; j < A.size(); j++) {
                int next = A.get(j);
                if(next < 0 && java.lang.Math.abs(next) > current) {
                    break;
                }
                current += next;
                if (current > bestSum) {
                    bestSum = current;
                }
            }
        }

        return bestSum;
    }

    public static void main(String[] args) {
        List<Integer> ar = Arrays.asList(
                -2, 1, -3, 4, -1, 2, 1, -5, 4
                /*56, -451, -222, 80, -57, -85, -304, -108, 95, -377, -282, -260, -497, -471, -97, -350, -147,
                62, -447, -229, 78, -165, -333, -427, -59, -338, 60, -207, -247, -431, -54, -240, -426, -123, -209,
                57, -74, -287, -70, -292, 45, -278, -408, -129, -35, 65, -77, -230, -426, 20, -402, -375, -449, -280,
                -125, -15, -21, -327, -366, 64, -211, -414, -307*/
        );
        System.out.println(maxSubArray(ar));
    }
}
