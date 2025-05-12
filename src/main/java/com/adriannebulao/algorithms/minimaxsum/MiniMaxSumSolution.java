package com.adriannebulao.algorithms.minimaxsum;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MiniMaxSumSolution {

    public static void miniMaxSum(List<Long> arr) {
        long min = 0;
        long max = 0;

        for (int i = 0; i < arr.size(); i++) {
            long sum = 0;

            for (int j = 0; j < arr.size(); j++) {
                if (j == i) {
                    continue;
                }
                sum += arr.get(j);
            }

            if (i == 0) {
                min = sum;
                max = sum;
            } else {
                min = Math.min(min, sum);
                max = Math.max(max, sum);
            }
        }

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Long> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(scan.nextLong());
        }

        miniMaxSum(arr);
    }
}