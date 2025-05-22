package com.adriannebulao.datastructures.twodarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoDArraySolution {

    public static int hourglassSum(List<List<Integer>> matrix) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = matrix.get(i).get(j) +matrix.get(i).get(j + 1) + matrix.get(i).get(j + 2) +
                        matrix.get(i + 1).get(j + 1) +
                        matrix.get(i + 2).get(j) + matrix.get(i + 2).get(j + 1) + matrix.get(i + 2).get(j + 2);
                maxSum = Math.max(
                        maxSum,
                        sum
                );
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                row.add(scan.nextInt());
            }
            matrix.add(row);
        }

        System.out.println(hourglassSum(matrix));
    }
}