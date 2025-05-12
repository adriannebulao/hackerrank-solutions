package com.adriannebulao.algorithms.diagonaldifference;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DiagonalDifferenceSolution {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftRightDiagonalSum = 0;
        int rightLeftDiagonalSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            leftRightDiagonalSum += arr.get(i).get(i);
            rightLeftDiagonalSum += arr.get(i).get(arr.get(i).size() - (i + 1));
        }

        return Math.abs(leftRightDiagonalSum - rightLeftDiagonalSum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                arr.get(i).add(scan.nextInt());
            }
        }

        System.out.println(diagonalDifference(arr));
    }
}
