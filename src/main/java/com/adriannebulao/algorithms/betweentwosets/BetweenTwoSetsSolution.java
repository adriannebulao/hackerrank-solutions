package com.adriannebulao.algorithms.betweentwosets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSetsSolution {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int totalBetween = 0;

        int max = Collections.max(a);
        int min = Collections.min(b);

        for (int i = max; i <= min; i += max) {
            boolean isValidA = true;
            boolean isValidB = true;

            for (int numA : a) {
                if (i % numA != 0) {
                    isValidA = false;
                    break;
                }
            }

            for (int numB : b) {
                if (numB % i != 0) {
                    isValidB = false;
                    break;
                }
            }

            if (isValidA && isValidB) {
                totalBetween++;
            }
        }

        return totalBetween;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scan.nextInt());
        }

        List<Integer> b = new ArrayList<>();
        for (int j = 0; j < m; j++) {
            b.add(scan.nextInt());
        }

        System.out.println(getTotalX(a, b));
    }
}
