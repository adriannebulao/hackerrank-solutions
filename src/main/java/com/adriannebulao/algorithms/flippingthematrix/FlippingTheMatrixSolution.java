package com.adriannebulao.algorithms.flippingthematrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlippingTheMatrixSolution {

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size() / 2;
        int size = matrix.size() - 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += Math.max(
                        Math.max(
                                matrix.get(i).get(j),
                                matrix.get(i).get(size - j)
                        ),
                        Math.max(
                                matrix.get(size - i).get(j),
                                matrix.get(size - i).get(size - j)));
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            int n = scan.nextInt();

            List<List<Integer>> matrix = new ArrayList<>();

            for (int j = 0; j < n * 2; j++) {
                List<Integer> current = new ArrayList<>();
                for (int k = 0; k < n * 2; k++) {
                    current.add(scan.nextInt());
                }
                matrix.add(current);
            }

            System.out.println(flippingMatrix(matrix));
        }
    }
}
