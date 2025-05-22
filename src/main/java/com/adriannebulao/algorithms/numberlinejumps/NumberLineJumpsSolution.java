package com.adriannebulao.algorithms.numberlinejumps;

import java.util.Scanner;

public class NumberLineJumpsSolution {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 > x2) {
            if (v1 == v2 || v1 > v2) {
                return "NO";
            }
        } else if (x2 > x1) {
            if (v1 == v2 || v2 > v1) {
                return "NO";
            }
        } else {
            if (v1 > v2 || v2 > v1) {
                return "NO";
            }
        }

        int upper = 0;
        int upperJump = 0;

        int lower = 0;
        int lowerJump = 0;

        if (x1 > x2) {
            upper = x1;
            upperJump = v1;

            lower = x2;
            lowerJump = v2;
        } else {
            upper = x2;
            upperJump = v2;

            lower = x1;
            lowerJump = v1;
        }

        while (lower < upper) {
            upper += upperJump;
            lower += lowerJump;
        }

        if (lower == upper) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1 = scan.nextInt();
        int v1 = scan.nextInt();

        int x2 = scan.nextInt();
        int v2 = scan.nextInt();

        System.out.println(kangaroo(x1, v1, x2, v2));
    }
}