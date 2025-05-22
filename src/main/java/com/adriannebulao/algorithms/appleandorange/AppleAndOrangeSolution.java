package com.adriannebulao.algorithms.appleandorange;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleAndOrangeSolution {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int appleCount = 0;
        for (int apple : apples) {
            int landedAt = a + apple;
            if (landedAt >= s && landedAt <= t) {
                appleCount++;
            }
        }

        int orangeCount = 0;
        for (int orange : oranges) {
            int landedAt = b + orange;
            if (landedAt >= s && landedAt <= t) {
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();
        int t = scan.nextInt();

        int a = scan.nextInt();
        int b = scan.nextInt();

        int m = scan.nextInt();
        int n = scan.nextInt();

        List<Integer> apples = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            apples.add(scan.nextInt());
        }

        List<Integer> oranges = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            oranges.add(scan.nextInt());
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}