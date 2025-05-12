package com.adriannebulao.algorithms.plusminus;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PlusMinusSolution {

    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int n : arr) {
            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.printf("%.6f\n", (double) positive / arr.size());
        System.out.printf("%.6f\n", (double) negative / arr.size());
        System.out.printf("%.6f", (double) zero / arr.size());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }

        plusMinus(arr);
    }
}
