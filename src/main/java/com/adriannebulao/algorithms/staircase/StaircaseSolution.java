package com.adriannebulao.algorithms.staircase;

import java.util.Scanner;

public class StaircaseSolution {

    public static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            String repeatChar = "#".repeat(i + 1);
            System.out.printf("%" + n + "s\n", repeatChar);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        staircase(n);
    }
}
