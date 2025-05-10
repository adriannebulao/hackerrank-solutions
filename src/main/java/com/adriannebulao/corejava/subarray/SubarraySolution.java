package com.adriannebulao.corejava.subarray;

import java.util.Scanner;
import java.util.Arrays;

public class SubarraySolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int negativeSubArr = 0;

        for (int j = 0; j < arr.length; j++) {
            for (int k = j; k < arr.length; k++) {
                int[] subArr = Arrays.copyOfRange(arr, j, k + 1);

                int sum = 0;
                for (int n : subArr) {
                    sum += n;
                }

                if (sum < 0) {
                    negativeSubArr++;
                }
            }
        }
        System.out.println(negativeSubArr);
    }
}
