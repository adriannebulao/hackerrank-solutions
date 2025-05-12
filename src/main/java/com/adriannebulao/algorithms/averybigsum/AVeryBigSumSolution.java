package com.adriannebulao.algorithms.averybigsum;

import java.util.Scanner;

public class AVeryBigSumSolution {

    public static long averyBigSum(long[] arr) {
        long sum = 0;

        for(long n : arr) {
            sum += n;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long[] arr = new long[scan.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextLong();
        }

        System.out.println(averyBigSum(arr));
    }
}
